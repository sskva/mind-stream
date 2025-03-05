package ru.ssk.mind_stream.filter;


import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.web.filter.OncePerRequestFilter;
import ru.ssk.mind_stream.domain.response.error.BaseError;
import ru.ssk.mind_stream.domain.response.error.ErrorResponse;

import java.io.IOException;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@Slf4j
public class AppAccessFilter extends OncePerRequestFilter {


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        response.setCharacterEncoding("UTF-8");
        String appAccessToken = request.getHeader("AppAccessToken");

        if (Strings.isEmpty(appAccessToken) || !appAccessToken.equalsIgnoreCase("jghfDSFogfkg88$%^")) {
            ErrorResponse errorResponse = ErrorResponse.builder()
                    .data(BaseError.builder()
                            .message("Ошибка авторизации клиента приложения")
                            .build())
                    .build();

            log.info("Отсутствует header AppAccessToken. ErrorResponse: {}", errorResponse);
            response.getWriter().write(new ObjectMapper().writeValueAsString(errorResponse));
            response.setStatus(BAD_REQUEST.value());
            response.setHeader("Content-Type", "application/json;charset=UTF-8");
            return;
        }

        filterChain.doFilter(request, response);
    }
}

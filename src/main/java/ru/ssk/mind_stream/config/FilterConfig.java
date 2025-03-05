package ru.ssk.mind_stream.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.ssk.mind_stream.filter.AppAccessFilter;

;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<AppAccessFilter> globalClientFilter() {
        return new FilterRegistrationBean<>(new AppAccessFilter());
    }
}

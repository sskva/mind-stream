package ru.ssk.mind_stream.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.ssk.mind_stream.domain.response.Response;
import ru.ssk.mind_stream.service.MindStreamService;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("mind-stream")
public class Controller {

    private final MindStreamService mindStreamService;

    @PostMapping("/add")
    public Response editPhrase(@RequestHeader final String accessToken) {

        log.info("START endpoint add");
        Response response = mindStreamService.add();
        log.info("END endpoint add, response: {}", response);
        return response;
    }

}
/*
операции создания — создание ресурса через метод POST ;
операции чтения — возврат представления ресурса через метод GET ;
операции редактирования — перезапись ресурса через метод PUT или редактирование через PATCH ;
операции удаления — удаление ресурса через метод DELETE .
 */
package ru.ssk.mind_stream.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.ssk.mind_stream.domain.response.Response;
import ru.ssk.mind_stream.service.MindStreamService;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("mind-stream")
public class Controller {

    private final MindStreamService mindStreamService;



    @PostMapping("/add") //create // insert
    public Response editPhrase(@RequestHeader final String appAccessToken) {

        log.info("START endpoint add");
        Response response = mindStreamService.add();
        log.info("END endpoint add, response: {}", response);
        return response;
    }



    @GetMapping("/get")  //read // select
    public Response get(@RequestHeader final String appAccessToken) {

        log.info("START endpoint get");
        Response response = mindStreamService.get();
        log.info("END endpoint get, response: {}", response);
        return response;
    }



    @PutMapping("/edit")  //update // update
    public Response edit(@RequestHeader final String appAccessToken) {

        log.info("START endpoint put");
        Response response = mindStreamService.edit();
        log.info("END endpoint put, response: {}", response);
        return response;
    }



    @DeleteMapping("/delete")  //delete // delete
    public Response delete(@RequestHeader final String accessToken) {

        log.info("START endpoint delete");
        Response response = mindStreamService.delete();
        log.info("END endpoint delete, response: {}", response);
        return response;
    }

}

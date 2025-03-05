package ru.ssk.mind_stream.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.sql.Delete;
import org.springframework.web.bind.annotation.*;
import ru.ssk.mind_stream.domain.api.AddReq;
import ru.ssk.mind_stream.domain.api.DeleteReq;
import ru.ssk.mind_stream.domain.api.EditReq;
import ru.ssk.mind_stream.domain.response.Response;
import ru.ssk.mind_stream.service.MindStreamService;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("mind-stream")
public class Controller {

    private final MindStreamService mindStreamService;



    @PostMapping("/add") // create // insert
    public void editPhrase(@RequestHeader final String appAccessToken, @RequestBody AddReq addReq) {

        log.info("START endpoint add, addReq: {}", addReq);
        mindStreamService.add(addReq);
    }



    @GetMapping("/get")  // read // select
    public Response get(@RequestHeader final String appAccessToken) {

        log.info("START endpoint get");
        Response response = mindStreamService.get();
        log.info("END endpoint get, response: {}", response);
        return response;
    }



    @PutMapping("/edit")  // update // update
    public void edit(@RequestHeader final String appAccessToken, @RequestBody EditReq editReq) {

        log.info("START endpoint edit, editReq: {}", editReq);
        mindStreamService.edit(editReq);
    }



    @DeleteMapping("/delete")  // delete // delete
    public void delete(@RequestHeader final String appAccessToken, @RequestBody DeleteReq deleteReq) {

        log.info("START endpoint delete");
        mindStreamService.delete(deleteReq);

    }

}

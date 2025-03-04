package ru.ssk.mind_stream.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.ssk.mind_stream.dao.Dao;
import ru.ssk.mind_stream.domain.api.AddReq;
import ru.ssk.mind_stream.domain.response.Response;
import ru.ssk.mind_stream.domain.response.success.SuccessResponse;

@Slf4j
@Service
@RequiredArgsConstructor
public class MindStreamServiceImpl implements MindStreamService {

    private final Dao dao;

    @Override
    public void add(AddReq addReq) {

        dao.add(addReq);
    }



    @Override
    public Response get() {

        return SuccessResponse.builder().data(dao.get()).build();
    }



    @Override
    public Response edit() {
        return null;
    }



    @Override
    public Response delete() {
        return null;
    }
}

package ru.ssk.mind_stream.service;

import ru.ssk.mind_stream.domain.api.AddReq;
import ru.ssk.mind_stream.domain.response.Response;

public interface MindStreamService {

    void add(AddReq addReq);

    Response get();

    Response edit();

    Response delete();
}

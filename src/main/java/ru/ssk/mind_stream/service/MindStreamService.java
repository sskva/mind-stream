package ru.ssk.mind_stream.service;

import ru.ssk.mind_stream.domain.api.AddReq;
import ru.ssk.mind_stream.domain.api.DeleteReq;
import ru.ssk.mind_stream.domain.api.EditReq;
import ru.ssk.mind_stream.domain.response.Response;

public interface MindStreamService {

    void add(AddReq addReq);

    Response get();

    void edit(EditReq editReq);

    void delete(DeleteReq deleteReq);
}

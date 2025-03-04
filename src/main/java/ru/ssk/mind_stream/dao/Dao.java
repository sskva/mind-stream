package ru.ssk.mind_stream.dao;


import ru.ssk.mind_stream.domain.api.AddReq;
import ru.ssk.mind_stream.domain.entity.MindStream;
import ru.ssk.mind_stream.domain.response.Response;

import java.util.List;

public interface Dao {


    void add(AddReq addReq);

    List<MindStream> get();
}

package ru.ssk.mind_stream.service;

import ru.ssk.mind_stream.domain.response.Response;

public interface MindStreamService {
    Response add();

    Response get();

    Response edit();

    Response delete();
}

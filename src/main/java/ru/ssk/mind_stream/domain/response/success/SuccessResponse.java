package ru.ssk.mind_stream.domain.response.success;

import ru.ssk.mind_stream.domain.response.Response;

public class SuccessResponse<T> implements Response {

    private T data;
}

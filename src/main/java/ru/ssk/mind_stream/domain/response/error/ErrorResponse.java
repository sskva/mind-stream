package ru.ssk.mind_stream.domain.response.error;

import ru.ssk.mind_stream.domain.response.Response;

public class ErrorResponse<T> implements Response {

    private T data;
}

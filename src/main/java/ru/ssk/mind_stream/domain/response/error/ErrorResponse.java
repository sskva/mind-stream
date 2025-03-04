package ru.ssk.mind_stream.domain.response.error;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.ssk.mind_stream.domain.response.Response;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse<T> implements Response {

    private T data;
}

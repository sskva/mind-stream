package ru.ssk.mind_stream.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MindStream {

    private long id;
    private String text;
    private String timeInsert;
}

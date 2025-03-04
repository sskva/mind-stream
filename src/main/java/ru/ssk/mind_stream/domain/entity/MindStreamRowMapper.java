package ru.ssk.mind_stream.domain.entity;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MindStreamRowMapper implements RowMapper<MindStream> {

    @Override
    public MindStream mapRow(ResultSet rs, int rowNum) throws SQLException {
        return MindStream.builder()
                .id(rs.getLong("id"))
                .text(rs.getString("text"))
                .timeInsert(rs.getString("time_insert"))
                .build();
    }
}
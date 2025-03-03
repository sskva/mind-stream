package ru.ssk.mind_stream.dao.impl;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.ssk.mind_stream.dao.Dao;
import ru.ssk.mind_stream.domain.api.AddReq;

import javax.sql.DataSource;

@Slf4j
@Repository
@Transactional
public class DaoImpl extends JdbcDaoSupport implements Dao {

    @Autowired
    private DataSource dataSource;



    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }



    @Override
    public void add(AddReq addReq) {

        getJdbcTemplate().update("INSERT INTO mind_stream(text) VALUE (?);", addReq.getText());
    }
}
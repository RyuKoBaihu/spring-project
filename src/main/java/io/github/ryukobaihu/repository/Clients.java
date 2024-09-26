package io.github.ryukobaihu.repository;

import io.github.ryukobaihu.domain.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class Clients {

    private static String INSERT = "insert into client (name) values (?) ";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Clients save(Client client) {
        jdbcTemplate.update(INSERT, new Object[] {client.getName()} );
        return client;
    }

}

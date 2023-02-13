package com.ncaoduc.DemoSpringSecurity.services;

import com.ncaoduc.DemoSpringSecurity.models.User;
import com.ncaoduc.DemoSpringSecurity.models.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> getUser() {
        String sql = "SELECT * from users";
        return jdbcTemplate.query(sql, new UserMapper());
    }
}

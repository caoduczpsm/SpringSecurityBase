package com.ncaoduc.DemoSpringSecurity.models.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ncaoduc.DemoSpringSecurity.models.User;
import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int row) throws SQLException {
        User userDetails = new User();
        userDetails.setUsername(rs.getString("username"));
        userDetails.setPassword(rs.getString("password"));
        userDetails.setRole(rs.getString("role"));

        return userDetails;
    }

}

package com.ncaoduc.DemoSpringSecurity.models.mappers;

import com.ncaoduc.DemoSpringSecurity.models.dto.UserDTO;
import com.ncaoduc.DemoSpringSecurity.models.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.core.userdetails.UserDetails;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User>{

    public static UserDTO ToUserDTO(User user){
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setRole(user.getRole());
        return dto;
    }

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setId(rs.getInt("user_id"));
        user.setUsername(rs.getString("username"));
        user.setPassword(rs.getString("password"));
        user.setRole(rs.getString("role"));
        return user;
    }
}

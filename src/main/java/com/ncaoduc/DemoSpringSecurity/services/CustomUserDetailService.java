package com.ncaoduc.DemoSpringSecurity.services;

import com.ncaoduc.DemoSpringSecurity.models.mappers.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

//    @Autowired
//    private UserRowMapper userRowMapper;
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//


}

package com.ncaoduc.DemoSpringSecurity.services;

import com.ncaoduc.DemoSpringSecurity.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<User> getUser();
}

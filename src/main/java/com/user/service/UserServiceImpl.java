package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    //fake user lists

    List<User> list= List.of(
            new User(1311L,"Shruti Agrawal","6178207105"),
            new User(1312L,"Shreya Agrawal","6182207105"),
            new User(1313L,"Vinita Agrawal","9999999999"),
            new User(1314L,"Rajesh Agrawal","6182207305")
    );
    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}

package com.gb.dz4.repositories;

import com.gb.dz4.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    private UserRepository userRepository;


    public List<User> findAll() {
        return userRepository.userList();
    }


    public List<User> userList() {

        List<User> userList = new ArrayList<>();
        userList.add(new User(1L, "Viktor", 25));
        userList.add(new User(2L, "Anna", 33));
        userList.add(new User(3L, "Olga", 19));
        userList.add(new User(4L, "Vera", 30));

        return userList;
    }
}

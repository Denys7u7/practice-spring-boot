package com.assessment.first.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.first.models.User;

@RestController
public class UserController {

    @RequestMapping(value = "user/{id}")
    public User getUser(@PathVariable Long id) {
        User user = new User();
        user.setId(id);
        user.setName("Lucas");
        user.setLastname("Moyu");
        user.setEmail("lucasmoy@gmail.com");
        user.setPhone("67766776");
        return user;
    }

    @RequestMapping(value = "user")
    public List<User> getAllUser() {
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setId(1L);
        user.setName("Lucas");
        user.setLastname("Moyu");
        user.setEmail("lucasmoy@gmail.com");
        user.setPhone("67766776");
        users.add(user);
        users.add(user);
        users.add(user);
        return users;
    }
    /*
     * @RequestMapping(value = "user")
     * public User updateUser() {
     * User user = new User();
     * user.setName("Lucas");
     * user.setLastname("Moyu");
     * user.setEmail("lucasmoy@gmail.com");
     * user.setPhone("67766776");
     * return user;
     * }
     * 
     * @RequestMapping(value = "user")
     * public User deleteUser() {
     * User user = new User();
     * user.setName("Lucas");
     * user.setLastname("Moyu");
     * user.setEmail("lucasmoy@gmail.com");
     * user.setPhone("67766776");
     * return user;
     * }
     * 
     * @RequestMapping(value = "user")
     * public User searchUser() {
     * User user = new User();
     * user.setName("Lucas");
     * user.setLastname("Moyu");
     * user.setEmail("lucasmoy@gmail.com");
     * user.setPhone("67766776");
     * return user;
     * }
     */

}

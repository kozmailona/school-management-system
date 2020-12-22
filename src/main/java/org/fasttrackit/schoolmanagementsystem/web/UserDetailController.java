package org.fasttrackit.schoolmanagementsystem.web;

import org.fasttrackit.schoolmanagementsystem.domain.UserDetail;
import org.fasttrackit.schoolmanagementsystem.dto.Login;
import org.fasttrackit.schoolmanagementsystem.exception.UserNotFoundException;
import org.fasttrackit.schoolmanagementsystem.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDetailController {

    @Autowired
    private UserDetailService userService;

    @GetMapping(path = "/user/{id}")
    public UserDetail getUser(@PathVariable("id") long id) {
        return userService.getUserById(id);
    }

    @ResponseBody
    @GetMapping(path = "/user")
    public UserDetail getUser(@RequestParam("email") String email) {
        return userService.getUserByEmail(email);
    }

    @PostMapping(path = "/user")
    public UserDetail saveUser(@RequestBody UserDetail user) {
        return userService.createUser(user);
    }

    @PostMapping(path = "/login")
    public Login checkLogin(@RequestBody Login login) throws UserNotFoundException {
        return userService.checkLogin(login);
    }

    @PutMapping(path = "/user/{id}")
    public UserDetail updateUser(@PathVariable long id, @RequestBody UserDetail userDetail) {
        return userService.updateUser(id, userDetail);
    }

    @DeleteMapping(path = "/user/{id}")
    public void deleteUser(@PathVariable("id") long id) {
        userService.deleteUserById(id);
    }

}

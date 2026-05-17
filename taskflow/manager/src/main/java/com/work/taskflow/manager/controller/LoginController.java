package com.work.taskflow.manager.controller;

import com.work.taskflow.manager.dao.UserDao;
import com.work.taskflow.manager.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

  @Autowired UserDao userDao;



  @GetMapping("/hello")
  public String login(@RequestParam String userName, @RequestParam String password) {
    User user = userDao.findByUserName(userName);
    if (user != null) {
      return (user.getPassword().equals(password)
          ? "password match - login sucess"
          : "wrong password");
    }
    return "user doesnt exist";
  }

  @PostMapping("/hello/addUser")
  public String signUp(@RequestBody User user) {
    User user1 = userDao.save(user);
    return user1.toString();
  }
}

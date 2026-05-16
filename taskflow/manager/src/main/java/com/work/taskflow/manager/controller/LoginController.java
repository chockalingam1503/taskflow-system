package com.work.taskflow.manager.controller;

import com.work.taskflow.manager.dao.UserDao;
import com.work.taskflow.manager.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    UserDao userDao;

 @GetMapping ("/hello")
public String testMethod(){
    return "hello world";
}

@GetMapping ("/hello/{userName}/{password}")
public String login(@PathVariable String userName, @PathVariable  String password){
    User user = userDao.findByUserName(userName);
    if(user!=null){
        return (user.getPassword().equals(password)?"password match - login sucess":"wrong password");
    }
    return "user doesnt exist";
}

}

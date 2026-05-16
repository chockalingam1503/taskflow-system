package com.work.taskflow.manager.dao;

import com.work.taskflow.manager.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {

   User findByUserName(String userName);

}

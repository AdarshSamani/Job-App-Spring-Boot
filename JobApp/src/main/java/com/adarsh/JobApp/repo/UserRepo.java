package com.adarsh.JobApp.repo;

import com.adarsh.JobApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String> {
    User findByUsername(String username);
}

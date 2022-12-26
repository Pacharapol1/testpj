package com.example.demo.model.service;

import com.example.demo.model.table.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Integer> {
    User findById (int id);

}

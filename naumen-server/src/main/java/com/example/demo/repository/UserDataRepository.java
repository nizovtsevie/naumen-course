package com.example.demo.repository;

import com.example.demo.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserDataRepository extends JpaRepository<UserData, Long> {
}
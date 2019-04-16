package com.example.demo.repository;

import com.example.demo.entity.Msg;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MsgRepository extends JpaRepository<Msg, Long> {
}
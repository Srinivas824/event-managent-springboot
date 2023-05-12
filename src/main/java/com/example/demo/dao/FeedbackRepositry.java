package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Feedback;

public interface FeedbackRepositry extends JpaRepository<Feedback, Integer> {

}

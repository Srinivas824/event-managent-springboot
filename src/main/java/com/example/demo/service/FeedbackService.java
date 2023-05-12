package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.FeedbackRepositry;
import com.example.demo.entity.Feedback;

@Service
public class FeedbackService {
	@Autowired
	FeedbackRepositry bookrpa;
	
	@Transactional
	public void addFeedback(Feedback feedback) {
		bookrpa.save(feedback);
	}
	@Transactional
	public List<Feedback> displayFeedback(){
		return bookrpa.findAll();
	}
	@Transactional 
	public void selectFeedback(int feedbackId) {
		bookrpa.deleteById(feedbackId);
	}
}

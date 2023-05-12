package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Feedback;
import com.example.demo.service.FeedbackService;

@RestController
public class FeedbackController {
	private FeedbackService fdkdao;
	
	@Autowired
	public FeedbackController(FeedbackService fdkdao) {
		this.fdkdao= fdkdao;
	}
	@RequestMapping("addFeedback")
	public void addFeedback(@RequestBody Feedback feed) {
		fdkdao.addFeedback(feed);
	}
	@GetMapping("displayAllFeedback")
	public List<Feedback> displayAllFeedback(){
		return fdkdao.displayFeedback();
	}
}

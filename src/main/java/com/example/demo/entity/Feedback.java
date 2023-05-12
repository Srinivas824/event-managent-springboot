package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="feedback")
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int feedbackId;
	
	private String name;
	
	private String email;
	
	private long phone;
	
	private long text;

	public Feedback() {
			}

	public Feedback(int feedbackId, String name, String email, long phone, long text) {
		super();
		this.feedbackId = feedbackId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.text = text;
	}

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public long getText() {
		return text;
	}

	public void setText(long text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", text=" + text + "]";
	}

	
	
	
	
}

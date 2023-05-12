package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BookingRepositry;
import com.example.demo.entity.Booking;

@Service
public class BookingService {
	@Autowired
	BookingRepositry bkjpa;
	
	@Transactional
	public void register(Booking booking) {
		bkjpa.save(booking);
		
	}
	@Transactional
	public List<Booking>displayAllBooking(){
		return bkjpa.findAll();
		}
	@Transactional
	public void removeBookingById(int bookingId) {
		bkjpa.deleteById(bookingId);
	}
	@Transactional
	public Booking selectBookingById(int bookingId) {
		return bkjpa.findById(bookingId).get();
	}
	@Transactional
	public void updateBooking(Booking booking) {
		bkjpa.save(booking);
	}
}

package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Booking;
import com.example.demo.service.BookingService;

@RestController
public class BookingController {
	
	private BookingService bkdao;
	
	@Autowired
	public BookingController(BookingService bkdao) {
		this.bkdao = bkdao;
		
	}
	@RequestMapping("addBooking")
	public void addBooking(@RequestBody Booking book) {
		bkdao.register(book);
	}
	@GetMapping("displayAllBooking")
	public List<Booking> displayAllBooking(){
		return bkdao.displayAllBooking();
	}
	@DeleteMapping("deleteBookingById/{bookingId}")
	public void deleteBooking(@PathVariable("bookingId")int bookingId) {
		bkdao.removeBookingById(bookingId);
	}
	@PutMapping("upadateBooking")
	public void updateBooking(@RequestBody Booking book) {
		bkdao.updateBooking(book);
	}
}

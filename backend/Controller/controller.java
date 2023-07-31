package com.example.demo.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.data;
import com.example.demo.Service.service;
import com.example.demo.booking.Booking;

@RestController
@CrossOrigin
public class controller {
	@Autowired
	service ser;
	
	@PostMapping("/post")
	public data addData(@RequestBody data data)
	{
		return ser.addData(data);
	}
	@PostMapping("/post2")
	public void addBooking(@RequestBody Booking bok)
	{
		 ser.addBooking(bok);
	}
	@GetMapping("/get")
	public List<data> getData()
	{
		return ser.getData();
	}
	@GetMapping("/get1")
	public List<Booking> getBooking()
	{
		return ser.getBooking();
	}
	@DeleteMapping("/del/{email}")
	public String delBooking(@PathVariable String email)
	{
		ser.delBooking(email);
		return "deleted successfully";
	}
	@PutMapping("/update")
	public Booking updateBooking(@RequestBody Booking bok)
	{
		return ser.updateBooking(bok);
	}
}


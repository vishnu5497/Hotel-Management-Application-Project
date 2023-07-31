package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Model.data;
//import com.example.demo.Repo.repository;
import com.example.demo.Repo.repository;
import com.example.demo.booking.Booking;
import com.example.demo.repository2.repo2;

@Service
public class service {
	@Autowired
	repository rep;
	@Autowired
	repo2 rep2;
	public data addData( data da)
	{
		return rep.save(da);
	}
	
	public Booking addBooking(Booking bok)
	{
		return rep2.save(bok);
	}
	public List<data> getData()
	{
		return rep.findAll();
	}
	
	public  List<Booking> getBooking()
	{
		return rep2.findAll();
	}
	public void delBooking(String email)
	{
		 rep2.deleteByEmail(email);
	}
	public Booking updateBooking(Booking bok)
	{
		return rep2.saveAndFlush(bok);
	}
}
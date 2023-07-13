package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.HotelManagement;
import com.example.demo.Service.HotelService;

@RestController
public class HotelController {

	@Autowired
	private HotelService hm;

	@GetMapping("/get")
	public List<HotelManagement> getDetails() {
		return hm.getAllDetails();
	}

	@PostMapping("/add")
	public HotelManagement addDetails(@RequestBody HotelManagement h) {
		return hm.addDetails(h);
	}

	@DeleteMapping("/del/{id}")
	public void delDetails(@PathVariable("id") int s) {
		hm.deleteId(s);
	}

	@GetMapping("/get/{id}")
	public Optional<HotelManagement> getDetails(@PathVariable("id") int id) {
		return hm.getOne(id);
	}

	
}

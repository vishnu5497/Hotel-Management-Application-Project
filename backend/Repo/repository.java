package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.data;
import com.example.demo.booking.Booking;

import jakarta.transaction.Transactional;
@Repository
public interface repository extends JpaRepository<data, String> {
	
}
 
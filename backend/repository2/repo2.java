package com.example.demo.repository2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.booking.Booking;

import jakarta.transaction.Transactional;

@Repository 
public interface repo2 extends JpaRepository<Booking,String>{

	
	@Modifying
	@Query(value = "delete from reservation where email= ?",nativeQuery=true)
	@Transactional
	public void deleteByEmail(String email);

}

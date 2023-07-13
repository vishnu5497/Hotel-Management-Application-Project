package com.example.demo.Service;


import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.HotelManagement;
import com.example.demo.Repositroy.Hotel;

@Service
public class HotelService {

	@Autowired
	public Hotel hs;

	public HotelManagement addDetails(HotelManagement h) {
		return hs.save(h);
	}

	public List<HotelManagement> getAllDetails() {
		return hs.findAll();
	}

	public void deleteId(int id) {
		hs.deleteById(id);
	}

	public Optional<HotelManagement> getOne(int id) {
		return hs.findById(id);
	}
	
	public HotelManagement update(int id,HotelManagement h)
	{
		HotelManagement hm=hs.findById(id).get();
		
		if(Objects.nonNull(hm)&&(!(Objects.isNull(h.getFname()))))
		{
			hm.setFname(h.getFname());
		}
		if(Objects.nonNull(hm)&&(!(Objects.isNull(h.getLname()))))
		{
			hm.setLname(h.getLname());
		}
		if(Objects.nonNull(hm)&&(!(Objects.isNull(h.getCid()))))
		{
			hm.setCid(h.getCid());
		}
		if(Objects.nonNull(hm)&&(!(Objects.isNull(h.getCod()))))
		{
			hm.setCod(h.getCod());
		}
		if(Objects.nonNull(hm)&&(!(Objects.isNull(h.getNor()))))
		{
			hm.setNor(h.getNor());
		}
		if(Objects.nonNull(hm)&&(!(Objects.isNull(h.getNop()))))
		{
			hm.setNop(h.getNop());
		}
		if(Objects.nonNull(hm)&&(!(Objects.isNull(h.getPhn()))))
		{
			hm.setPhn(h.getPhn());
		}
		return hs.save(hm);
	}
}
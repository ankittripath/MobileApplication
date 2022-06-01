package com.product.mobileApplication.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.mobileApplication.model.Mobile;
import com.product.mobileApplication.repository.MobileRepo;
import com.product.mobileApplication.service.MobileService;

@RestController
public class MobileController {
	
	@Autowired
	private MobileRepo mobilerepository;
	
	@Autowired
	private MobileService ms;
	
	
	@PostMapping("/addMobile")
	public Mobile addMobile(@RequestBody Mobile mob)
	{
		return mobilerepository.save(mob);
	}
	
	@GetMapping("/getAllMobile")
	public  List<Mobile> fetchAllMobile()
	{
		return mobilerepository.findAll();
	}
	
	@GetMapping("/getMobile/{id}")
	public  Optional<Mobile> fetchMobileById(@PathVariable int id)
	{
		return mobilerepository.findById(id);
	}
	
	@DeleteMapping("/deleteMobile/{id}")
	public String deleteMobileById(@PathVariable int id)
	{
		String result;
		
		try{
			mobilerepository.deleteById(id);
			result = "result deleted successfully thank you!!!! ";
		}
		catch(Exception e)
		{
			result = "product not deleted";
		}
		
		return result;
		
	}
	
	
	@DeleteMapping("/deleteAllMobile")
	public String deleteAllMobile()
	{
		String result;
		try {
			mobilerepository.deleteAll();
			result="all data deleted successfully!!!";
		}
		catch(Exception e)
		{
			result="Error occured";
		}	
		return result;
	}
	
	@PutMapping("/updateMobile")
	public Mobile updateMobile(@RequestBody Mobile mob) {
		return ms.updateMobileRecord(mob);
	}

}

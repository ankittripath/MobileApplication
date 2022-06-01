package com.product.mobileApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.mobileApplication.model.Mobile;
import com.product.mobileApplication.repository.MobileRepo;

@Service
public class MobileService {
	@Autowired
	private MobileRepo mobilerepository;

	public Mobile updateMobileRecord(Mobile mob) {
		// TODO Auto-generated method stub
		 
		return mobilerepository.save(mob);
	}
}




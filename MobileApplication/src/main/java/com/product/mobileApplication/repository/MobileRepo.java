package com.product.mobileApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.mobileApplication.model.Mobile;

@Repository	
public interface MobileRepo extends JpaRepository<Mobile, Integer>{

	
}

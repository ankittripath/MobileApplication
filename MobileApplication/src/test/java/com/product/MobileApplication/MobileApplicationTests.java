package com.product.MobileApplication;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.product.mobileApplication.model.Mobile;
import com.product.mobileApplication.repository.MobileRepo;

@SpringBootTest		
class MobileApplicationTests {

	@Autowired
	private MobileRepo mobilerepository;
	 
	
	@Test
	public void saveMobileData() {
		
//		Mobile mobile = Mobile.Builder()
//						.modelName("one plus")
//						.storage(256)
//						.price(50000)	
//						.build();
////		
////		mobile.setModelName("one plus");
////		mobile.setStorage(256);
////		mobile.setPrice(50000);
//		
//		
//		mobilerepository.save(mobile);
	}

}

package com.product.mobileApplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(
		
		name="mobile_store",
		uniqueConstraints = @UniqueConstraint(
		name="modelName_unique",
		columnNames = "modelName"		 
		)
		
		
)
//@Builder
public class Mobile {

	@Id
	@SequenceGenerator(
			name="mobile_sequence",
			sequenceName="mobile_sequence",
			allocationSize=1
			
	)
	
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator="mobile_sequence"
	)
	
	
//	@GeneratedValue(
//		strategy = GenerationType.IDENTITY	
//		)
	private int seriesno;
	private String modelName;
	
	@Column(
			 
			nullable=false
		)
	private int storage;
	
	@Column(nullable = false)
	private int  price;
	
	
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Mobile(int seriesno, String modelName, int storage, int price) {
		super();
		this.seriesno = seriesno;
		this.modelName = modelName;
		this.storage = storage;
		this.price = price;
	}


	public int getSeriesNo() {
		return seriesno;
	}


	public void setSeriesNo(int seriesno) {
		this.seriesno = seriesno;
	}


	public String getModelName() {
		return modelName;
	}


	public void setModelName(String modelName) {
		this.modelName = modelName;
	}


	public int getStorage() {
		return storage;
	}


	public void setStorage(int storage) {
		this.storage = storage;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
		
	
	
	
}

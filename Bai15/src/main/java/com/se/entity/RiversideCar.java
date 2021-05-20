package com.se.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity (name = "riversidecars")
@Table(name = "riversidecars")
public class RiversideCar implements Serializable{

	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
	private int id;
	
	@Column(name="carname")
	private String carname; 
	
	@Column(name="price")
	private double price;
	
	@Column(name="modelyear")
	private int modelyear; 
	
	@Column(name="cardescription")
	private String cardescription;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getModelyear() {
		return modelyear;
	}

	public void setModelyear(int modelyear) {
		this.modelyear = modelyear;
	}

	public String getCardescription() {
		return cardescription;
	}

	public void setCardescription(String cardescription) {
		this.cardescription = cardescription;
	}

	public RiversideCar(int id, String carname, double price, int modelyear, String cardescription) {
		super();
		this.id = id;
		this.carname = carname;
		this.price = price;
		this.modelyear = modelyear;
		this.cardescription = cardescription;
	}

	public RiversideCar() {
		super();
	}

	@Override
	public String toString() {
		return "RiversideCar [id=" + id + ", carname=" + carname + ", price=" + price + ", modelyear=" + modelyear
				+ ", cardescription=" + cardescription + "]";
	}

	
	
	
}

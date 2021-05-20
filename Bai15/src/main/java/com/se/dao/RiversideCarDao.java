package com.se.dao;

import java.util.List;

import com.se.entity.RiversideCar;






public interface RiversideCarDao{
	 public List<RiversideCar> getRiversideCar();
	 public void deleteRiversideCar(int id);
	 public void addRiversideCar(RiversideCar x);
	 public List<RiversideCar> searchRiversideCar(String x);
	 public List<RiversideCar> sortRiversideCar();


}

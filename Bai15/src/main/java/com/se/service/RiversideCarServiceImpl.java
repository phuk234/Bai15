package com.se.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.se.dao.RiversideCarDaoImpl;
import com.se.entity.RiversideCar;





@Service
public class RiversideCarServiceImpl implements RiversideCarService{
	@Autowired
    private RiversideCarDaoImpl bookdao;
	
	
    
   
	public RiversideCarServiceImpl() {
		super();
	}




	@Override
	@Transactional("webTransactionManager")
    public List<RiversideCar> getRiversideCar() {
            return bookdao.getRiversideCar();
    }




	@Override
	@Transactional("webTransactionManager")
	public void deleteRiversideCar(int id) {
		bookdao.deleteRiversideCar(id);
		
	}




	@Override
	@Transactional("webTransactionManager")
	public void addRiversideCar(RiversideCar x) {
		bookdao.addRiversideCar(x);
		
	}




	@Override
	@Transactional("webTransactionManager")
	public List<RiversideCar> searchRiversideCar(String x) {

		return bookdao.searchRiversideCar(x);
	}




	@Override
	@Transactional("webTransactionManager")
	public List<RiversideCar> sortRiversideCar() {
		// TODO Auto-generated method stub
		return bookdao.sortRiversideCar();
	}
}

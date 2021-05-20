package com.se.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.se.entity.RiversideCar;






@Repository
public class RiversideCarDaoImpl implements RiversideCarDao{
	@Autowired
	@Qualifier("webSessionFactory")
	private SessionFactory sessionFactory;
	
	
    
	public RiversideCarDaoImpl() {
		super();
	}



	@Override
	public List<RiversideCar> getRiversideCar() {
    	// get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();
        // create a query  ... sort by last name
        Query<RiversideCar> theQuery = currentSession.createNativeQuery("Select *from riversidecars",RiversideCar.class); 
                       //currentSession.createQuery("from books");
      
        // execute query and get result list
        List<RiversideCar> kq=theQuery.getResultList();
        // return the results		
        return kq;
	}
	
	
	@Override
	public List<RiversideCar> sortRiversideCar() {
    	// get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();
        // create a query  ... sort by last name
        Query<RiversideCar> theQuery = currentSession.createNativeQuery("Select *from riversidecars order by carname asc",RiversideCar.class); 
                       //currentSession.createQuery("from books");
      
        // execute query and get result list
        List<RiversideCar> kq=theQuery.getResultList();
        // return the results		
        return kq;
	}

	@Override
	public List<RiversideCar> searchRiversideCar(String x) {
    	// get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();
        // create a query  ... sort by last name
        Query<RiversideCar> theQuery = currentSession.createNativeQuery("Select *from riversidecars where carname like N'%%"+x+"%%'",RiversideCar.class); 
                       //currentSession.createQuery("from books");
      
        // execute query and get result list
        List<RiversideCar> kq=theQuery.getResultList();
        // return the results		
        return kq;
	}



	@Override
	public void deleteRiversideCar(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
        currentSession.createNativeQuery("delete from riversidecars where id="+id).executeUpdate();
                      
	}
	
	

	@Override
	public void addRiversideCar(RiversideCar x) {
		Session currentSession = sessionFactory.getCurrentSession();
        currentSession.createNativeQuery("insert riversidecars values('"+x.getCarname()+"',"+x.getPrice()+","+x.getModelyear()+",'"+x.getCardescription()+"')").executeUpdate();
                      
	}

}

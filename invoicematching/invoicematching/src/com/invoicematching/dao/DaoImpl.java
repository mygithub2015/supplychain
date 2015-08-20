package com.invoicematching.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class DaoImpl implements Dao{
	private SessionFactory sf;
	 public void getSessionFactory(){
		sf = new AnnotationConfiguration().configure().buildSessionFactory();
		//return sf;

	}
	public void save(Object obj){
		System.out.println("inside save method");
		Session session = null;
		Transaction trans = null;
		try{
			if(sf == null) getSessionFactory();
			session = sf.openSession();
			trans = session.beginTransaction();
			session.save(obj);		
			trans.commit();
		}catch(HibernateException he){
			System.out.println("Could not save or commit, "+he.getMessage());
			he.getStackTrace();
			trans.rollback();
		}

	}

}

package com.invoice.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.invoice.model.InvoiceHeader;
import com.invoice.model.LoginUser;

//@Repository("userDao")  
public class UserDaoImpl implements UserDao {

	private SessionFactory sessionFactory;  

	// generate setters and getters
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void saveUser(InvoiceHeader invoiceHeader) {
		sessionFactory.getCurrentSession().saveOrUpdate(invoiceHeader);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<InvoiceHeader> getUserList() {
		return (List<InvoiceHeader>) sessionFactory.getCurrentSession().createCriteria(InvoiceHeader.class).list();
	}

	public boolean find(String name, String password) 
	{
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		String SQL_QUERY = "From LoginUser u where u.name='" + name + "' and u.password='" + password + "'";
		System.out.println(SQL_QUERY);

		Query query = session.createQuery(SQL_QUERY);
		Iterator<LoginUser> itr = query.iterate();

		List<LoginUser> list = query.list();
		if (list.size() > 0) 
		{
			//System.out.println("User found");
			session.close();
			return true;
		}
		//System.out.println("User not found");
		session.close();
		return false;
	}
}

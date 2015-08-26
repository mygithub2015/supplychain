package com.invoicematching.service;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.invoicematching.beans.Promotion;
import com.invoicematching.dao.PromotionDaoImpl;


public class Service {
	Logger logger = Logger.getLogger("service");
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

	public void service(Promotion promotion){
		
		//HibernateTemplate template = context.getBean("template",org.springframework.orm.hibernate3.HibernateTemplate.class);
		//		PromotionDao dao = new PromotionDao();
		//		dao.setTemplate(template);
		PromotionDaoImpl dao = context.getBean("promotionDao", com.invoicematching.dao.PromotionDaoImpl.class);
		//logger.log(Level.INFO, "records are going to be inserted");
		logger.info("records are going to be inserted!!!");
		dao.save(promotion);
		logger.info("records are inserted!!!");
	}
	
}

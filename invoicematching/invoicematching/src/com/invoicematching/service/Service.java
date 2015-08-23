package com.invoicematching.service;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.invoicematching.beans.Promotion;
import com.invoicematching.dao.PromotionDao;


public class Service {
	Logger logger = Logger.getLogger("service");

	public void service(Promotion promotion){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//HibernateTemplate template = context.getBean("template",org.springframework.orm.hibernate3.HibernateTemplate.class);
		//		PromotionDao dao = new PromotionDao();
		//		dao.setTemplate(template);
		PromotionDao dao = context.getBean("promotionDao", com.invoicematching.dao.PromotionDao.class);
		//logger.log(Level.INFO, "records are going to be inserted");
		logger.info("records are going to be inserted!!!");
		dao.save(promotion);
		logger.info("records are inserted!!!");
	}
}

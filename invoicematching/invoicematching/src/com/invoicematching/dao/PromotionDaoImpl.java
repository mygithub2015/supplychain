package com.invoicematching.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.invoicematching.beans.Items;

public class PromotionDaoImpl implements Dao {
	HibernateTemplate template;
	Logger logger = Logger.getLogger(com.invoicematching.dao.PromotionDaoImpl.class);

	public HibernateTemplate getTemplate() {
		return template;

	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}  
	public void save(Object entity){
		template.save(entity);
	}
	public void update(Object entity){
		//		template.update(entity);
		template.saveOrUpdate(entity);
	}

	@Override
	public Items getItemsById(int id) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		/*PromotionDaoImpl dao = context.getBean("promotionDao", com.invoicematching.dao.PromotionDaoImpl.class);*/;
		template = (HibernateTemplate) context.getBean("template");
		Items item = (Items) template.get(Items.class, id);
		/*		Items item = (Items) template.load(Items.class, id);
		 */		return item;
	}

	//	@SuppressWarnings("unchecked")
	@Override
	public List<Integer> getIds(int id) {
		// TODO Auto-generated method stub
		List<Integer> itemIdList = null;
		if(id == 0){
			String query = "SELECT itemId FROM Items";
			logger.info("PromotionDaoImpl -> getIds :: "+query);
			itemIdList = template.find(query);
		}else{
			String str = "SELECT itemId FROM Items WHERE itemId = ?";
			Query query = template.getSessionFactory().openSession().createQuery(str);
			query.setInteger(0, id);
			logger.info("PromotionDaoImpl -> getIds :: "+query.getQueryString());
			itemIdList = query.list();
		}
		logger.info("list of ids"+itemIdList);
		return itemIdList;
	}



}

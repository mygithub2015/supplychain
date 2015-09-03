package com.invoicematching.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.invoicematching.beans.Items;

public class PromotionDaoImpl implements Dao {
	HibernateTemplate template;

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
	

	
}

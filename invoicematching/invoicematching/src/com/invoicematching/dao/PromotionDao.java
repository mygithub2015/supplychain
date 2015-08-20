package com.invoicematching.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class PromotionDao {
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
		template.update(entity);
	}

}

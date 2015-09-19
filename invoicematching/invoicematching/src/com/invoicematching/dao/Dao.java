package com.invoicematching.dao;

import java.util.List;

import com.invoicematching.beans.Items;

public interface Dao {
	
	//void getSessionFactory();
	void save(Object obj);
	Items getItemsById(int id);
	void update(Object object); //to update records
	List<Integer> getIds(int id);

}

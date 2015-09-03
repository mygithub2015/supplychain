package com.invoicematching.dao;

import com.invoicematching.beans.Items;

public interface Dao {
	
	//void getSessionFactory();
	void save(Object obj);
	Items getItemsById(int id);

}

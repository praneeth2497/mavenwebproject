package com.praneeth.web1.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.praneeth.web1.model.Product;
@Component
@Repository
public class ProductDaoImpl implements ProductDao {
@Autowired
SessionFactory sessionFactory;
	
	public boolean insert(Product product) {
	Session session=sessionFactory.openSession();
	session.save(product);
Transaction transaction=session.beginTransaction();	
	transaction.commit();
		return false;
	}

}

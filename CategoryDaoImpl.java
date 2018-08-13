package com.praneeth.web1.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.praneeth.web1.model.Category;
@Component
@Repository
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	SessionFactory sessionFactory;
	public boolean insert(Category category) {
		Session session=sessionFactory.openSession();
		session.save(category);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		return false;
	}

}

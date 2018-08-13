package com.praneeth.web1.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.praneeth.web1.model.Supplier;
@Component
@Repository
public class SupplierDaoImpl implements SupplierDao{

	@Autowired
	SessionFactory sessionFactory;
	public boolean insert(Supplier supplier) {
		Session session=sessionFactory.openSession();
		session.save(supplier);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		return false;
	}

}

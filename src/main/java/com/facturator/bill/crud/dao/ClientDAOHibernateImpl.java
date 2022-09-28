package com.facturator.bill.crud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.facturator.bill.crud.entity.Client;

@Repository
public class ClientDAOHibernateImpl implements ClientDAO {
	
	// define field for entitymanager	
	private EntityManager entityManager;
			
		// set up constructor injection
		@Autowired
		public ClientDAOHibernateImpl(EntityManager theEntityManager) {
			
			entityManager = theEntityManager;
		}

	@Override
	@Transactional
	public List<Client> findAll() {
		
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// create a query
		Query<Client> theQuery = currentSession.createQuery("from Client", Client.class);
		
		// execute query and get result list
		List<Client> clients = theQuery.getResultList();
		
		// return the results		
		return clients;
		
	}

}

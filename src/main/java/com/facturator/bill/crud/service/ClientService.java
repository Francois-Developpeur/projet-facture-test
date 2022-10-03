package com.facturator.bill.crud.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facturator.bill.crud.entity.Client;
import com.facturator.bill.crud.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository cr;
	
	@Transactional
	public Client saveCustomer(Client cli) {
	
		Client nouveauClient = cr.save(cli);
		return nouveauClient;
	}
}

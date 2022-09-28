package com.facturator.bill.crud.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.facturator.bill.crud.dao.ClientDAO;
import com.facturator.bill.crud.entity.Client;

@RestController
@RequestMapping("/api")
public class ClientRestController {
	
	private ClientDAO clientDAO;
	
	@Autowired
	public ClientRestController(ClientDAO theClientDAO) {
		
		clientDAO = theClientDAO;
	}
	
	// expose "/employees" and return list of employees
	@GetMapping("/clients")
	public List<Client> findAll() {
		
		return clientDAO.findAll();
	}

}

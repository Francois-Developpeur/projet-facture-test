package com.facturator.bill.crud.dao;

import java.util.List;

import com.facturator.bill.crud.entity.Client;

public interface ClientDAO {

	public List<Client> findAll();
}

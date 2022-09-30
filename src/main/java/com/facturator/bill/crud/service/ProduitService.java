package com.facturator.bill.crud.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facturator.bill.crud.entity.Produit;
import com.facturator.bill.crud.repository.ProduitRepository;

@Service
public class ProduitService {

	@Autowired
	private ProduitRepository pr;
		
	@Transactional
    public Produit saveProduct(Produit pro) {
    
        Produit nouveauProduit = pr.save(pro);
        return nouveauProduit;
	
	}
	
	@Transactional
	public Li
}
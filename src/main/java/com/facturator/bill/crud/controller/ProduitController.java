package com.facturator.bill.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.facturator.bill.crud.entity.Produit;
import com.facturator.bill.crud.service.ProduitService;

@RestController
@RequestMapping("/facturation")
public class ProduitController {

@Autowired
private ProduitService ps;

	// request body interragi avec le json on le fait dans le controller car c'est la derniere couche 

@PostMapping("/produit")
public Produit saveProduit(@RequestBody Produit pro) {
    Produit newProduct = ps.saveProduct(pro);
    return newProduct;
}
	
}

package com.facturator.bill.crud.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.facturator.bill.crud.entity.Entreprise;

public interface EntrepriseRepository extends JpaRepository<Entreprise, BigInteger> {

}

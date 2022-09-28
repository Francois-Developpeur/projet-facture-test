package com.facturator.bill.crud.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="base_facturation")	
public class BaseFacturation {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="fac_numero")
	private String fNumero;
	
	@Column(name="fac_bon_de_commande")
	private int fBonDeCommande;
	
	@Column(name="fac_date_facture")
	private Date fDateFacture;
	
	@Column(name="fac_date_echeance")
	private Date fDateEcheance;
	
	@Column(name="fac_paiement_recu")
	private Date fPaiementRecu;
	
	@Column(name="fac_reglement")
	private String fReglement;
	
	@Column(name="fac_pourcentage_remise")
	private Double fPourcentageRemise;
	
	@Column(name="fac_nbr_heure")
	private String fNbrHeure;
	
	@Column(name="fac_tva")
	private Double fTVA;
	
//	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
//	@JoinColumn(name="cli_numero")
//	private int fk_cNumero;
//	
//	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
//	@JoinColumn(name="ent_numero_siret")
//	private int fk_eNumeroSiret;
//	
//	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
//	@JoinColumn(name="pro_reference")
//	private int fk_pReference;
	
	public BaseFacturation() {
		
	}

	public BaseFacturation(String fNumero, int fBonDeCommande, Date fDateFacture, Date fDateEcheance,
			Date fPaiementRecu, String fReglement, Double fPourcentageRemise, String fNbrHeure, Double fTVA
//			int fk_cNumero, int fk_eNumeroSiret, int fk_pReference
			) {
		this.fNumero = fNumero;
		this.fBonDeCommande = fBonDeCommande;
		this.fDateFacture = fDateFacture;
		this.fDateEcheance = fDateEcheance;
		this.fPaiementRecu = fPaiementRecu;
		this.fReglement = fReglement;
		this.fPourcentageRemise = fPourcentageRemise;
		this.fNbrHeure = fNbrHeure;
		this.fTVA = fTVA;
//		this.fk_cNumero = fk_cNumero;
//		this.fk_eNumeroSiret = fk_eNumeroSiret;
//		this.fk_pReference = fk_pReference;
	}

	public String getfNumero() {
		return fNumero;
	}

	public void setfNumero(String fNumero) {
		this.fNumero = fNumero;
	}

	public int getfBonDeCommande() {
		return fBonDeCommande;
	}

	public void setfBonDeCommande(int fBonDeCommande) {
		this.fBonDeCommande = fBonDeCommande;
	}

	public Date getfDateFacture() {
		return fDateFacture;
	}

	public void setfDateFacture(Date fDateFacture) {
		this.fDateFacture = fDateFacture;
	}

	public Date getfDateEcheance() {
		return fDateEcheance;
	}

	public void setfDateEcheance(Date fDateEcheance) {
		this.fDateEcheance = fDateEcheance;
	}

	public Date getfPaiementRecu() {
		return fPaiementRecu;
	}

	public void setfPaiementRecu(Date fPaiementRecu) {
		this.fPaiementRecu = fPaiementRecu;
	}

	public String getfReglement() {
		return fReglement;
	}

	public void setfReglement(String fReglement) {
		this.fReglement = fReglement;
	}

	public Double getfPourcentageRemise() {
		return fPourcentageRemise;
	}

	public void setfPourcentageRemise(Double fPourcentageRemise) {
		this.fPourcentageRemise = fPourcentageRemise;
	}

	public String getfNbrHeure() {
		return fNbrHeure;
	}

	public void setfNbrHeure(String fNbrHeure) {
		this.fNbrHeure = fNbrHeure;
	}

	public Double getfTVA() {
		return fTVA;
	}

	public void setfTVA(Double fTVA) {
		this.fTVA = fTVA;
	}

//	public int getFk_cNumero() {
//		return fk_cNumero;
//	}
//
//	public void setFk_cNumero(int fk_cNumero) {
//		this.fk_cNumero = fk_cNumero;
//	}
//
//	public int getFk_eNumeroSiret() {
//		return fk_eNumeroSiret;
//	}
//
//	public void setFk_eNumeroSiret(int fk_eNumeroSiret) {
//		this.fk_eNumeroSiret = fk_eNumeroSiret;
//	}
//
//	public int getFk_pReference() {
//		return fk_pReference;
//	}
//
//	public void setFk_pReference(int fk_pReference) {
//		this.fk_pReference = fk_pReference;
//	}

	@Override
	public String toString() {
		return "BaseFacturation [fNumero=" + fNumero + ", fBonDeCommande=" + fBonDeCommande + ", fDateFacture="
				+ fDateFacture + ", fDateEcheance=" + fDateEcheance + ", fPaiementRecu=" + fPaiementRecu
				+ ", fReglement=" + fReglement + ", fPourcentageRemise=" + fPourcentageRemise + ", fNbrHeure="
				+ fNbrHeure + ", fTVA=" + fTVA + 
//				", fk_cNumero=" + fk_cNumero + ", fk_eNumeroSiret=" + fk_eNumeroSiret
//				+ ", fk_pReference=" + fk_pReference + 
				"]";
	}
	
}

package com.endev.gestock.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="article")
public class Article implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idArticle;
	
	private String CodeArticle;
	
	private String designation;
	
    private double prixUnitaireHT;
    
    private double tauxTva;
    
    private double prixUnitaireTTC;
    
    private String photo;
    
    @ManyToOne
    @JoinColumn(name="idCategorie")
    private Categorie categorie;
    
    
	public Long getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}

	public Article() {
		
		
	}

	public String getCodeArticle() {
		return CodeArticle;
	}

	public void setCodeArticle(String codeArticle) {
		CodeArticle = codeArticle;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getPrixUnitaireHT() {
		return prixUnitaireHT;
	}

	public void setPrixUnitaireHT(double prixUnitaireHT) {
		this.prixUnitaireHT = prixUnitaireHT;
	}

	public double getTauxTva() {
		return tauxTva;
	}

	public void setTauxTva(double tauxTva) {
		this.tauxTva = tauxTva;
	}

	public double getPrixUnitaireTTC() {
		return prixUnitaireTTC;
	}

	public void setPrixUnitaireTTC(double prixUnitaireTTC) {
		this.prixUnitaireTTC = prixUnitaireTTC;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Article(String codeArticle, String designation, double d, double e,
			double f, String photo) {
		super();
		CodeArticle = codeArticle;
		this.designation = designation;
		this.prixUnitaireHT = d;
		this.tauxTva = e;
		this.prixUnitaireTTC = f;
		this.photo = photo;
	}
	
	
	
}

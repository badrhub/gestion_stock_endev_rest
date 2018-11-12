package com.endev.gestock.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utilisateur implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUtilisateur;
	
	private String nom;
	
	private String prenom;
	
	private String email;
	
	private Long motDePass;
	
	private String photo;

	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMotDePass() {
		return motDePass;
	}

	public void setMotDePass(Long motDePass) {
		this.motDePass = motDePass;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Utilisateur() {
		
	}

	public Utilisateur(String nom, String prenom, String email, Long motDePass, String photo) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.motDePass = motDePass;
		this.photo = photo;
	}
	
	
}

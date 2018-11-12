package com.endev.gestock.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.endev.gestock.entities.Utilisateur;


public interface UtilisateurRepository extends JpaRepository<Utilisateur , Long>{

    /*//public Utilisateur enregistrer(Utilisateur entity);
	
	//public Utilisateur update(Utilisateur entity);
	
	//public List<Utilisateur> Objectlist();
	
	//public Utilisateur ObjectById(Long id);
	
	//public void delete(Long id);
	
	public List<Utilisateur> selectAll(String sortField, String sort);
	
	public Utilisateur findOne(String paramName , Object paramValue);
	
	public Utilisateur findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);*/
	
}

package com.endev.gestock.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.endev.gestock.entities.Fournisseur;



public interface FournisseurRepository extends JpaRepository<Fournisseur , Long>{

   /* //public Fournisseur enregistrer(Fournisseur entity);
	
	//public Fournisseur update(Fournisseur entity);
	
	//public List<Fournisseur> Objectlist();
	
	//public Fournisseur ObjectById(Long id);
	
	//public void delete(Long id);
	
	public List<Fournisseur> selectAll(String sortField, String sort);
	
	public Fournisseur findOne(String paramName , Object paramValue);
	
	public Fournisseur findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);*/
	
}

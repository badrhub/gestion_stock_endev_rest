package com.endev.gestock.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.endev.gestock.entities.Categorie;

public interface CategorieRepository  extends JpaRepository<Categorie, Long> {
/*
    //public Categorie enregistrer(Categorie entity);
	
	//public Categorie update(Categorie entity);
	
	//public List<Categorie> Objectlist();
	
	//public Categorie ObjectById(Long id);
	
	//public void delete(Long id);
	
	public List<Categorie> selectAll(String sortField, String sort);
	
	public Categorie findOne(String paramName , Object paramValue);
	
	public Categorie findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);*/
	
	
}

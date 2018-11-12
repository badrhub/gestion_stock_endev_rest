package com.endev.gestock.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.endev.gestock.entities.LigneCommandeFournisseur;

public interface LigneCommandeFournisseurRepository extends JpaRepository<LigneCommandeFournisseur, Long>{

    /*//public LigneCommandeFournisseur enregistrer(LigneCommandeFournisseur entity);
	
	//public LigneCommandeFournisseur update(LigneCommandeFournisseur entity);
	
	//public List<LigneCommandeFournisseur> Objectlist();
	
	//public LigneCommandeFournisseur ObjectById(Long id);
	
	//public void delete(Long id);
	
	public List<LigneCommandeFournisseur> selectAll(String sortField, String sort);
	
	public LigneCommandeFournisseur findOne(String paramName , Object paramValue);
	
	public LigneCommandeFournisseur findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);
	*/
}

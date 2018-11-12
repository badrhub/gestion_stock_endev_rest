package com.endev.gestock.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.endev.gestock.entities.LigneCommandeClient;

public interface LigneCommandeClientRepository extends JpaRepository<LigneCommandeClient, Long>  {

    /*//public LigneCommandeClient enregistrer(LigneCommandeClient entity);
	
	//public LigneCommandeClient update(LigneCommandeClient entity);
	
	//public List<LigneCommandeClient> Objectlist();
	
	//public LigneCommandeClient ObjectById(Long id);
	
	//public void delete(Long id);
	
	public List<LigneCommandeClient> selectAll(String sortField, String sort);
	
	public LigneCommandeClient findOne(String paramName , Object paramValue);
	
	public LigneCommandeClient findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);*/
	
}

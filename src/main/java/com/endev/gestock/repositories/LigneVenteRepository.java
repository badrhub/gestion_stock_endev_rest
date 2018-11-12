package com.endev.gestock.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.endev.gestock.entities.LigneVente;

public interface LigneVenteRepository extends JpaRepository<LigneVente, Long> {

    /*//public LigneVente enregistrer(LigneVente entity);
	
	//public LigneVente update(LigneVente entity);
	
	//public List<LigneVente> Objectlist();
	
	//public LigneVente ObjectById(Long id);
	
	//public void delete(Long id);
	
	public List<LigneVente> selectAll(String sortField, String sort);
	
	public LigneVente findOne(String paramName , Object paramValue);
	
	public LigneVente findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);*/
	
}

package com.endev.gestock.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.endev.gestock.entities.Vente;

public interface VenteRepository extends JpaRepository<Vente, Long>{

   /* //public Vente enregistrer(Vente entity);
	
	//public Vente update(Vente entity);
	
	//public List<Vente> Objectlist();
	
	//public Vente ObjectById(Long id);
	
	//public void delete(Long id);
	
	public List<Vente> selectAll(String sortField, String sort);
	
	public Vente findOne(String paramName , Object paramValue);
	
	public Vente findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);*/
	
}

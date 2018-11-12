package com.endev.gestock.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.endev.gestock.entities.CommandeFournisseur;

public interface CommandeFournisseurRepository  extends JpaRepository<CommandeFournisseur, Long> {
/*
   // public CommandeFournisseur enregistrer(CommandeFournisseur entity);
	
//	public CommandeFournisseur update(CommandeFournisseur entity);
	
//	public List<CommandeFournisseur> Objectlist();
	
//	public CommandeFournisseur ObjectById(Long id);
	
//	public void delete(Long id);
	
	public List<CommandeFournisseur> selectAll(String sortField, String sort);
	
	public CommandeFournisseur findOne(String paramName , Object paramValue);
	
	public CommandeFournisseur findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);
	*/
}

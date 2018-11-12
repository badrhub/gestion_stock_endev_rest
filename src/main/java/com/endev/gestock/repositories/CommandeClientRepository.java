package com.endev.gestock.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.endev.gestock.entities.CommandeClient;

public interface CommandeClientRepository  extends JpaRepository<CommandeClient, Long> {

   /* //public CommandeClient enregistrer(CommandeClient entity);
	
	//public CommandeClient update(CommandeClient entity);
	
	//public List<CommandeClient> Objectlist();
	
	//public CommandeClient ObjectById(Long id);
	
	//public void delete(Long id);
	
	public List<CommandeClient> selectAll(String sortField, String sort);
	
	public CommandeClient findOne(String paramName , Object paramValue);
	
	public CommandeClient findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);*/
	
}

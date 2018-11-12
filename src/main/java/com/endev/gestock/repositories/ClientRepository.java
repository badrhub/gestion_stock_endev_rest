package com.endev.gestock.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.endev.gestock.entities.Client;

public interface ClientRepository  extends JpaRepository<Client, Long>{

    /*//public Article enregistrer(Article entity);
	
	////public Client update(Client entity);
	
	//public List<Client> Objectlist();
	
	//public Client ObjectById(Long id);
	
	//public void delete(Long id);
	
	public List<Client> selectAll(String sortField, String sort);
	
	public Client findOne(String paramName , Object paramValue);
	
	public Client findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);*/
	
}

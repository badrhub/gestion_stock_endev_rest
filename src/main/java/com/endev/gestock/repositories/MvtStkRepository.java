package com.endev.gestock.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.endev.gestock.entities.MvtStk;

public interface MvtStkRepository extends JpaRepository<MvtStk , Long>{

     // public MvtStk enregistrer(MvtStk entity);
	
	/*//public MvtStk update(MvtStk entity);
	
	//public List<MvtStk> Objectlist();
	
	//public MvtStk ObjectById(Long id);
	
	//public void delete(Long id);
	
	public List<MvtStk> selectAll(String sortField, String sort);
	
	public MvtStk findOne(String paramName , Object paramValue);
	
	public MvtStk findOne(String[] paramNames , Object[] paramValues);
	
	public int findCountBy(String paramName , String paramValue);*/
	
}

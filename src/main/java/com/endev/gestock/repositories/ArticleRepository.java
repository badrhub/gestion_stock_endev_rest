package com.endev.gestock.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.endev.gestock.entities.Article;

public interface ArticleRepository extends JpaRepository<Article, Long>{


     //public Article save(Article entity);
	
	//public Article update(Article entity);
	
	//public List<Article> selectAll();
	
	//public Article get(Long id);
	
	//public void delete(Long id);
	
	//public List<Article> selectAll(String sortField, String sort);
	
	//public Article findOne(String paramName , Object paramValue);
	
	//public Article findOne(String[] paramNames , Object[] paramValues);
	
	//public int findCountBy(String paramName , String paramValue);
}

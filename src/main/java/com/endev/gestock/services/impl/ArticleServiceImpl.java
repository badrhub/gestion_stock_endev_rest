/*package com.endev.gestock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.endev.gestock.dao.IArticleDao;
import com.endev.gestock.entities.Article;
import com.endev.gestock.repositories.IArticleService;


@Transactional
public class ArticleServiceImpl implements IArticleService{

	IArticleDao dao;
	
	
	
    public void setDao(IArticleDao dao) {
		this.dao = dao;
	}
	@Override
	public Article enregistrer(Article entity) {
		return dao.enregistrer(entity);
	}

	@Override
	public Article update(Article entity) {
		return dao.update(entity);
	}

	@Override
	public List<Article> Objectlist() {
		return dao.Objectlist();
	}

	@Override
	public Article ObjectById(Long id) {
		return dao.ObjectById(id);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

	@Override
	public List<Article> ObjectAllBySort(String sortField, String sort) {
		return dao.ObjectAllBySort(sortField, sort);
	}

	@Override
	public Article findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Article findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
*/

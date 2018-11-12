package com.endev.gestock.services.impl;

import java.io.InputStream;

import com.endev.gestock.repositories.IFlickrDao;

public class FlickrServiceImpl implements IFlickrService{

	
	IFlickrDao dao;
	
	@Override
	public String savePhoto(InputStream photo, String title) throws Exception {
		return dao.savePhoto(photo, title);
	}
	
	public void setDao(IFlickrDao dao) {
		this.dao = dao;
	}

	

}

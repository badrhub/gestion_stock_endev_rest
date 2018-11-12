package com.endev.gestock.services.impl;

import java.io.InputStream;


public interface IFlickrService {
	
	public String savePhoto(InputStream photo , String title) throws Exception;
		

}

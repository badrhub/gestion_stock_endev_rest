package com.endev.gestock.repositories;

import java.io.InputStream;


public interface IFlickrDao {
	
	public String savePhoto(InputStream photo , String title) throws Exception;
		

}

package com.endev.gestock;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import com.endev.gestock.services.impl.FlickrDaoImpl;

public class Test {

	public static void main(String[] args) {
		FlickrDaoImpl flickr = new FlickrDaoImpl();
		//flickr.auth();
	    
		try {
		InputStream stream = new FileInputStream(new File("E:\\travaux\\images\\image1.png"));
		String url = flickr.savePhoto(stream, "myImage");
		System.out.println(url);
		
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}

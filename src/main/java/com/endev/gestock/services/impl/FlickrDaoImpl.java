package com.endev.gestock.services.impl;

import java.io.InputStream;
import javax.swing.JOptionPane;
import org.scribe.model.Token;
import org.scribe.model.Verifier;
import com.endev.gestock.repositories.IFlickrDao;
import com.flickr4java.flickr.Flickr;
import com.flickr4java.flickr.FlickrException;
import com.flickr4java.flickr.REST;
import com.flickr4java.flickr.RequestContext;
import com.flickr4java.flickr.auth.Auth;
import com.flickr4java.flickr.auth.AuthInterface;
import com.flickr4java.flickr.auth.Permission;
import com.flickr4java.flickr.uploader.UploadMetaData;


public class FlickrDaoImpl implements IFlickrDao{
	
	
	private Flickr flickr;
	private UploadMetaData uploadMetaData = new UploadMetaData();
	private String apiKey = "9a5eb0e14c2d03da9e413889c368a481";
    private String sharedSecret = "0ae388a142c3e29e" ;
    
	
	private void  connect() {
		flickr = new Flickr(apiKey , sharedSecret , new REST());
		Auth auth = new Auth();
		auth.setPermission(Permission.READ);
		auth.setToken("72157701961678801-3468501fef79a04e");
		auth.setTokenSecret("71d533d5bc45733b");
		RequestContext requestContext = RequestContext.getRequestContext();
		requestContext.setAuth(auth);
		flickr.setAuth(auth);
	}
	
	
	public String savePhoto(InputStream photo, String title) throws Exception {
		connect();
		uploadMetaData.setTitle(title);
		String photoId = flickr.getUploader().upload(photo, uploadMetaData);
		return flickr.getPhotosInterface().getPhoto(photoId).getMedium640Url();
	}
	
	public void auth() {
		flickr = new Flickr(apiKey , sharedSecret , new REST());
		AuthInterface authInterface = flickr.getAuthInterface();
		Token token = authInterface.getRequestToken();
		System.out.println("token: " + token);
		
		String url  = authInterface.getAuthorizationUrl(token, Permission.DELETE);
		System.out.println("Follow this URL to authoirize your self on Flickr");
		System.out.println(url);
		System.out.println("Paste in the token it gives you : ");
		System.out.println(">>");
		String tokenKey = JOptionPane.showInputDialog(null);
		Token requestToken = authInterface.getAccessToken(token, new Verifier(tokenKey));
		System.out.println("Authentification success");
		
		Auth auth = null ;
		try {
			auth = authInterface.checkToken(requestToken);
		}catch(FlickrException e) {
			e.printStackTrace();
		}
		
		System.out.println("Token : " + requestToken.getToken()); 
		System.out.println("secret : " + requestToken.getSecret());
		System.out.println("nsid : " + auth.getUser().getId());
		System.out.println("Realname: " + auth.getUser().getRealName());
		System.out.println("Username : " + auth.getUser().getUsername());
		System.out.println("Permission : " + auth.getPermission().getType());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}

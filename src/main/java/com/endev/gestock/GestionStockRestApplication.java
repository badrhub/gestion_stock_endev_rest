package com.endev.gestock;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.endev.gestock.entities.Article;
import com.endev.gestock.repositories.ArticleRepository;

@SpringBootApplication
public class GestionStockRestApplication implements CommandLineRunner{
	
	@Autowired
	private ArticleRepository articleRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(GestionStockRestApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		 
		articleRepository.save(new Article("aaa111","design1",1111.0,23.0,12.9 ,"ff1"));
		articleRepository.save(new Article("aaa222","design2",1111.0,23.0,12.9 ,"ff2"));
		articleRepository.save(new Article("aaa333","design3",1111.0,23.0,12.9 ,"ff3"));
		
		List<Article> list = articleRepository.findAll();
		
		for(Article a : list) {
			System.out.println(a.getCodeArticle());
		}
		/*private String CodeArticle;
		
		private String designation;
		
	    private BigDecimal prixUnitaireHT;
	    
	    private BigDecimal tauxTva;
	    
	    private BigDecimal prixUnitaireTTC;
	   
	    private String photo;  */
	}
}

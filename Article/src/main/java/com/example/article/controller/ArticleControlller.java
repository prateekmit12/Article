package com.example.article.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.article.model.Article;
import com.example.article.service.ArticleService;

@RestController
@RequestMapping("/api/auth")
public class ArticleControlller {
	
	@Autowired
	ArticleService articleService;
	
	
	@PostMapping("/articles")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public ResponseEntity<String> createArticle(@RequestBody Article article) {
		
			articleService.addNewArticle(article);
			
			return new ResponseEntity<String>("Article created successfully!",HttpStatus.CREATED);
	}
	
	@GetMapping("/articles")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public ResponseEntity<?> getArticles() {
		
		List<Article> article = new ArrayList<>();
		
		article = articleService.getArticle();
		
		if(article == null) {
			
			return new ResponseEntity<String>("No Articls Found!!",HttpStatus.NOT_FOUND);
			
		}
		  return new ResponseEntity<List<Article>>(article,HttpStatus.OK);
	}
	 
	
}
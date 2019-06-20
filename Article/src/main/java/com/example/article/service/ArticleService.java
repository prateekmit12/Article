package com.example.article.service;

import java.util.List;

import com.example.article.model.Article;

public interface ArticleService {
	
	    public List<Article> getArticle();
	    public Article addNewArticle(Article emp);

}

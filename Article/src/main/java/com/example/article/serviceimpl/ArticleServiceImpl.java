package com.example.article.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.article.model.Article;
import com.example.article.repository.ArticleRepository;
import com.example.article.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {
	
	@Autowired
	ArticleRepository articleRepository; 

	@Override
	public List<Article> getArticle() {
		// TODO Auto-generated method stub
		return articleRepository.findAll();
	}

	@Override
	public Article addNewArticle(Article article) {
		// TODO Auto-generated method stub
		return articleRepository.save(article);
	}

}

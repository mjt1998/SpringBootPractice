package com.mjt.service.impl;

import com.mjt.pojo.Article;
import com.mjt.repository.ArticleRepository;
import com.mjt.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Description
 * @Author mjt
 * @Time 2022/7/15
 */
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleRepository articleRepository;


    @Override
    public List<Article> getArticleList() {
        return articleRepository.findAll();
    }

    @Override
    public Article findArticleById(long id) {
        return articleRepository.findById(id);
    }
}

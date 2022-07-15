package com.mjt.service;

import com.mjt.pojo.Article;

import java.util.List;

/**
 * @Description
 * @Author mjt
 * @Time 2022/7/15
 */
public interface ArticleService {

    public List<Article> getArticleList();

    public Article findArticleById(long id);

}

package com.mjt.service;

import com.mjt.pojo.Article;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author mjt
 * @Time 2022/7/15
 */
@Service
public interface ArticleService {

    public List<Article> getArticleList();

    public Article findArticleById(long id);

}

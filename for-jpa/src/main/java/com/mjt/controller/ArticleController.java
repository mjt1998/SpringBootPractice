package com.mjt.controller;

import com.mjt.pojo.Article;
import com.mjt.repository.ArticleRepository;
import com.mjt.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Description
 * @Author mjt
 * @Time 2022/7/15
 */

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private ArticleService articleService;

    /**
     *
     * @Description: 获取文章列表
     * @Author mjt
     * @Date 2022/7/15
     */
    @RequestMapping("/articleList")
    public ModelAndView articleList(@RequestParam(value = "start", defaultValue = "0") Integer start,
                                    @RequestParam(value = "limit", defaultValue = "5") Integer limit){

        // 获取文章起始处
        start = start < 0 ? 0 : start;

        // 文章根据 id 降序排序
        Sort sort = Sort.by(Sort.Direction.DESC, "id");

        // 排序后分页输出
        Pageable pageable = PageRequest.of(start, limit, sort);
        Page<Article> page = articleRepository.findAll(pageable);

        ModelAndView mav = new ModelAndView("article/list");
        mav.addObject("page", page);
        return mav;
    }

    @RequestMapping("/articleLists")
    public List<Article> articleLists(@RequestParam(value = "start", defaultValue = "0") Integer start,
                            @RequestParam(value = "limit", defaultValue = "5") Integer limit){

        List<Article> all = articleRepository.findAll();
        return all;
    }


    /**
     *
     * @Description:
     * @Author mjt
     * @Date 2022/7/17
     */
    @RequestMapping("/findArticleById")
    public Article findArticleById(Integer id){
        Article article = articleService.findArticleById(id);
        return article;
    }



}

package com.telecommunication.service;


import com.telecommunication.model.Article;

public interface ArticleService {


    /**
     * 获取单个文章
     */
    Article selectArticleById(Integer id);


}

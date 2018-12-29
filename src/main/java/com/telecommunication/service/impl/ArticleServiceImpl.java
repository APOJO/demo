package com.telecommunication.service.impl;

import com.telecommunication.dao.ArticleMapper;

import com.telecommunication.model.Article;
import com.telecommunication.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  lmf
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;


    @Override
    public Article selectArticleById(Integer id) {
        return articleMapper.selectArticleById(id);
    }


}

package com.telecommunication.dao;

import com.telecommunication.model.Article;
import org.springframework.stereotype.Repository;
/**
 * @author  lmf
 */
@Repository
public interface ArticleMapper {

    /**
     * @author  查询单个
     */
    Article selectArticleById(Integer id);


}
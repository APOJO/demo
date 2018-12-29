package com.telecommunication.controller;

import com.telecommunication.model.Article;
import com.telecommunication.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author  lmf
 */
@RequestMapping("/article")
@Api(tags = "文章")
@RestController
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @ApiOperation(value = "获取文章列表", notes = "获取文章列表")
    @ResponseBody
    @GetMapping("/{id}")
    public Article getById(@PathVariable Integer id) {
        return articleService.selectArticleById(id);
    }
}

package com.java.learnbootletter.controller;

import com.java.learnbootletter.model.Article;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Article hello(){

        Article article = new Article().builder().id(3l).name("中文").build();
        return article;
    }
}

package com.diana.recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index"})
    private  String getIndexPage(){
        System.out.println("Some message to say... 1234 Diana Moron dasdasd");
        return "index";
    }
}

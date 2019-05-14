package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("tolist")
    public String togoodPage(){
        return "list";
    }

    @RequestMapping("toAddGoods")
    public String toAddGoods(){
        return "add";
    }
}

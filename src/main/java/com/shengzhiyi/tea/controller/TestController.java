package com.shengzhiyi.tea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/tea")
public class TestController {

    @RequestMapping(value = "/getTeaList", method = RequestMethod.GET)
    @ResponseBody
    public List<String> getTeaList() {
        List<String> list = new ArrayList();
        list.add("奶茶");
        list.add("柠檬水");
        list.add("圣代");
        return list;
    }

    @RequestMapping("/getview")
    public String getView(){
        return "test";
    }
    
}

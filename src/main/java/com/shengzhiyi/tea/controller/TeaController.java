package com.shengzhiyi.tea.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/tea")
public class TeaController {

    @RequestMapping(value = "/getTeaList", method = RequestMethod.GET)
    @ResponseBody
    public List<String> getTeaList() {
        List<String> list = new ArrayList();
        list.add("奶茶");
        list.add("柠檬水");
        list.add("圣代");
        return list;
    }

}

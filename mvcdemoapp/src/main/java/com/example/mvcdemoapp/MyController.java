package com.example.mvcdemoapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @GetMapping("/")
    public String welcome() {
        return "index";
    }

    @GetMapping("add")
    public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j) {
        ModelAndView mv = new ModelAndView("add");

        int k = i + j;
        mv.addObject("result", k);
        return mv;
    }
}

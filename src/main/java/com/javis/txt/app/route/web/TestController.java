package com.javis.txt.app.route.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("test", "test");
        return "index";
    }
}

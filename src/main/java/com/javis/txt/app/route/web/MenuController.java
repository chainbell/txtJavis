package com.javis.txt.app.route.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping(value = "/menu")
public class MenuController {

    @GetMapping("/chat")
    public String chat() {
        log.info("MenuController test 페이지 진입");
        return "page/chatMenu";
    }


}

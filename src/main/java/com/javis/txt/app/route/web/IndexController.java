package com.javis.txt.app.route.web;

import com.javis.txt.dto.auth.AuthInfoDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@Slf4j
public class IndexController {

    @GetMapping("/")
    public String index() {
        log.info("IndexController index 페이지 진입");
        return "index";
    }

    @PostMapping("/main")
    public String main(AuthInfoDTO authInfoDTO){
        log.info("IndexController main 페이지 진입");
        log.info(authInfoDTO.toString());

        return "html/main";
    }

}

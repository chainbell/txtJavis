package com.javis.txt.app.route.api;

import com.javis.txt.app.service.AuthService;
import com.javis.txt.dto.auth.AuthInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/auth")
public class AuthController {

    @Autowired
    AuthService authService;

    /**
     * 로그인 시도
     */
    @GetMapping("/admin/login")
    public AuthInfoDTO getLoginInfo(@RequestParam(name = "id") String id, @RequestParam(name = "password") String password) {

        AuthInfoDTO result = authService.getAdminAuthInfo(id, password);

        return result;
    }




}

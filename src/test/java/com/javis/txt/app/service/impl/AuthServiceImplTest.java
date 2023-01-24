package com.javis.txt.app.service.impl;

import com.javis.txt.app.service.AuthService;
import com.javis.txt.dto.auth.AuthInfoDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AuthServiceImplTest {

    @Autowired
    AuthService authService;

    @Test
    public void getAdminAuthInfo(){
        String id = "admin";
        String password = "admin";

        AuthInfoDTO result = authService.getAdminAuthInfo(id, password);

    }

}
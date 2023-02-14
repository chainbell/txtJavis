package com.javis.txt.app.service.impl;

import com.javis.txt.app.service.AuthService;
import com.javis.txt.common.util.Aes256Encryptor;
import com.javis.txt.dto.auth.AuthInfoDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AuthServiceImplTest {

    @Autowired
    AuthService authService;

    @Value("${aes.encrypt.key}")
    String aesKey;

    /*
    @Test
    public void getAdminAuthInfo() throws Exception {
        AuthInfoDTO result = authService.getAdminAuthInfo("admin","admin");
        System.out.println(result.toString());
    }
    */

/*
    @Test
    public void setAdminAuthInfo() throws Exception {
        boolean result = authService.setAdminAuthInfo("admin", "admin");
        System.out.println(result);
    }
 */

}
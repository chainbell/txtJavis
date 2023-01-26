package com.javis.txt.app.service.impl;

import com.javis.txt.app.service.AuthService;
import com.javis.txt.common.util.Aes256Encryptor;
import com.javis.txt.dao.user.entity.AdminUser;
import com.javis.txt.dao.user.repository.AdminUserRepository;
import com.javis.txt.domain.user.admin.AdminUserVO;
import com.javis.txt.dto.auth.AuthInfoDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AuthServiceImpl implements AuthService {

    @Autowired
    AdminUserRepository adminUserRepository;

    @Value("${aes.encrypt.key}")
    String aesKey;

    @Override
    public AuthInfoDTO getAdminAuthInfo(String id, String password) {

        AuthInfoDTO authInfoDTO = null;

        // 1. id, password 암호화 처리
        AdminUserVO adminUserVO = AdminUserVO.builder().id(id).password(password).build();

        // 2. rdb 정보 조회
        try{
            AdminUser info = adminUserRepository.findByIdAndPassword(adminUserVO.getId(), adminUserVO.getPassword());

            // 2-1. 없으면 실패
            if(info == null){
                log.info("2-1. 없으면 실패");
                authInfoDTO = new AuthInfoDTO(false,"","");
            }
            // 2-2. 있으면 성공 -> 정보 세팅
            else{
                log.info("2-2. 있으면 성공 -> 정보 세팅");
                Aes256Encryptor aes256Encryptor = new Aes256Encryptor();
                authInfoDTO = new AuthInfoDTO(true, aes256Encryptor.encrypt(id, aesKey), id);
            }
        }
        catch (Exception e){
            log.error("error");
            e.printStackTrace();
            authInfoDTO = new AuthInfoDTO(false,"","");
        }

        return authInfoDTO;
    }

    @Override
    public boolean setAdminAuthInfo(String id, String password) {

        AdminUserVO adminUserVO = AdminUserVO.builder().id(id).password(password).build();

        try{
            AdminUser adminUser = new AdminUser(adminUserVO.getId(), adminUserVO.getPassword());
            adminUserRepository.save(adminUser);
        }
        catch (Exception e){
            return false;
        }

        return true;
    }
}

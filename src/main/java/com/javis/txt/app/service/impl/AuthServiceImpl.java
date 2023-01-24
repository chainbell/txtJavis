package com.javis.txt.app.service.impl;

import com.javis.txt.app.service.AuthService;
import com.javis.txt.dao.user.entity.AdminUser;
import com.javis.txt.dao.user.repository.AdminUserRepository;
import com.javis.txt.domain.user.admin.AdminUserVO;
import com.javis.txt.dto.auth.AuthInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    AdminUserRepository adminUserRepository;

    @Override
    public AuthInfoDTO getAdminAuthInfo(String id, String password) {

        // 1. id, password 암호화 처리
        AdminUserVO adminUser = AdminUserVO.builder().id(id).password(password).build();

        // 2. rdb 정보 조회
        try{
            AdminUser info = adminUserRepository.findByIdAndPassword(adminUser.getId(), adminUser.getPassword());

            // 2-1. 없으면 실패
            if(info == null){

            }
            // 2-2. 있으면 성공 -> 정보 세팅
            else{

            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}

package com.javis.txt.app.service;

import com.javis.txt.dto.auth.AuthInfoDTO;

import java.util.Map;

public interface AuthService {

    AuthInfoDTO getAdminAuthInfo(String id, String password);

    boolean setAdminAuthInfo(String id, String password);

}

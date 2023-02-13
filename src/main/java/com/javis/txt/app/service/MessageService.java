package com.javis.txt.app.service;

import java.util.List;

public interface MessageService {

    // 1. 메시지 조회
    List getMessge(String authKey);

    // 2. 메시지 저장(발송)
    boolean setMessage(String authKey, String message);

}

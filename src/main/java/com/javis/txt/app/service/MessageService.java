package com.javis.txt.app.service;

import com.javis.txt.domain.message.type.MessageType;

import java.util.List;

public interface MessageService {

    // 1. 메시지 조회
    List getMessge(String authKey);

    // 2. 메시지 저장(발송)
    boolean setMessage(String authKey, MessageType messageType, String message);

}

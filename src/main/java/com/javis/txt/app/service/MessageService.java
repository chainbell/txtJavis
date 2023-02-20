package com.javis.txt.app.service;

import com.javis.txt.domain.message.type.MessageType;

import java.util.List;

public interface MessageService {

    // 1. 메시지 조회
    List getMessge(String authKey);

    // 2. 메시지 처리
    boolean setMessage(int sender, MessageType messageType, String message);

    // 3. 메시지 전송
    boolean sendMessage(String messageId);

}

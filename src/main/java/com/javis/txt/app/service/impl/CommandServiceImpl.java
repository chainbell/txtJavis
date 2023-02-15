package com.javis.txt.app.service.impl;

import com.javis.txt.app.service.CommandService;
import com.javis.txt.dao.message.MessageDBRepository;
import com.javis.txt.dao.message.entity.MessageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CommandServiceImpl implements CommandService {

    @Autowired
    MessageDBRepository messageDBRepository;

    @Override
    public boolean processCommand(String messageId) {

        // 1. messageId 기준 message 정보를 rdb에서 조회
        MessageInfo messageInfo = messageDBRepository.getMessageInfoRepository().findById(messageId).orElse(null);
        if(messageInfo == null){
            return false;
        }

        // 2. message data와 message type에 대한 처리 진행

        // 3. message 처리 결과를 rdb에 저장

        return true;
    }



}

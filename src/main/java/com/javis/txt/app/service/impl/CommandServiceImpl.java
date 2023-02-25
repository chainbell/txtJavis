package com.javis.txt.app.service.impl;

import com.javis.txt.app.service.CommandService;
import com.javis.txt.dao.message.MessageDBRepository;
import com.javis.txt.dao.message.entity.MessageInfo;
import com.javis.txt.domain.message.type.MessageType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CommandServiceImpl implements CommandService {

    @Autowired
    MessageDBRepository messageDBRepository;

    @Override
    public boolean processSearch(String messageId) {

        // 1. messageId 기준 message 정보를 rdb에서 조회
        MessageInfo messageInfo = messageDBRepository.getMessageInfoRepository().findById(messageId).orElse(null);
        if(messageInfo == null){
            return false;
        }

        // 2. message type 검증
        if(!MessageType.SEARCH.name().equals(messageInfo.getType())){
            return false;
        }

        // 3. 검색 처리 진행 - 구글


        // 4. message 처리 결과를 rdb에 저장

        return true;
    }

    @Override
    public boolean processCommand(String messageId) {

        // 1. messageId 기준 message 정보를 rdb에서 조회
        MessageInfo messageInfo = messageDBRepository.getMessageInfoRepository().findById(messageId).orElse(null);
        if(messageInfo == null){
            return false;
        }

        // 2. message type 검증
        if(!MessageType.COMMAND.name().equals(messageInfo.getType())){
            return false;
        }

        // 3. 명령어 처리 - 구상 중
        

        // 4. message 처리 결과를 rdb에 저장

        return false;
    }


}

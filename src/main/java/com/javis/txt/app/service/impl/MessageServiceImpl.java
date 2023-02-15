package com.javis.txt.app.service.impl;

import com.javis.txt.app.service.CommandService;
import com.javis.txt.app.service.MessageService;
import com.javis.txt.domain.message.MessageVO;
import com.javis.txt.domain.message.type.MessageType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MessageServiceImpl implements MessageService {

    @Autowired
    CommandService commandService;

    @Override
    public List getMessge(String authKey) {

        // 1. 메시지 최신 기준 조회

        return null;
    }

    @Override
    public boolean setMessage(String authKey, MessageType messageType, String message) {

        // 1. message type 추출 - message 포맷 필요 (최초 입력 특수문자를 기준으로 분기 - enum 정리 필요)
        MessageVO messageVO = MessageVO.builder().type(messageType).data(message).build();

        // 2. 메시지 rdb 저장 (메시지 타입, 메시지 데이터 타입, 메시지)
        log.info(">>>> " + messageVO.toString());

        // 3. message type 별 명령어 처리 서비스 함수(Command Service) 호출
        commandService.processCommand(messageVO.getId());

        return false;

    }

}

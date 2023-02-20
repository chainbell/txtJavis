package com.javis.txt.app.service.impl;

import com.javis.txt.app.service.CommandService;
import com.javis.txt.app.service.MessageService;
import com.javis.txt.dao.message.MessageDBRepository;
import com.javis.txt.dao.message.entity.MessageInfo;
import com.javis.txt.domain.message.MessageVO;
import com.javis.txt.domain.message.type.MessageType;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MessageServiceImpl implements MessageService {

    @Autowired
    CommandService commandService;

    @Autowired
    MessageDBRepository messageDBRepository;

    @Override
    public List getMessge(String authKey) {

        // 1. 메시지 최신 기준 조회

        return null;
    }

    @Override
    @Transactional
    public boolean setMessage(int sender, MessageType messageType, String message) {

        log.info("* Message Service :: setMessage ");

        // 1. message type 추출 - message 포맷 필요 (최초 입력 특수문자를 기준으로 분기 - enum 정리 필요)
        MessageVO messageVO = MessageVO.builder().type(messageType).data(message).build();

        // 2. 메시지 rdb 저장 (메시지 타입, 메시지 데이터 타입, 메시지)
        try{
            messageDBRepository.getMessageInfoRepository().save(
                    MessageInfo.builder()
                            .id(messageVO.getId())
                            .type(messageVO.getType().name())
                            .data(messageVO.getData())
                            .sender(sender)
                            .build()
            );
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }

        // 3. commmand/search type 별 명령어 처리 서비스 함수(Command Service) 호출
        try{
            if(messageType == MessageType.SEARCH){
                commandService.processSearch(messageVO.getId());
            }
            else if(messageType == MessageType.COMMAND){
                commandService.processCommand(messageVO.getId());
            }
            else{

            }
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }

        // 4. message 메시지 전송
        try{
            sendMessage(messageVO.getId());
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }

        return true;

    }

    @Override
    public boolean sendMessage(String messageId) {

        // 1. messageInfo 조회

        // 2. message 발송 처리 (대화방 관리 스키마 설계 필요)

        return false;
    }

}

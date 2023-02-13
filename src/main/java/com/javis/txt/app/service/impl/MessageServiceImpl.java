package com.javis.txt.app.service.impl;

import com.javis.txt.app.service.MessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MessageServiceImpl implements MessageService {

    @Override
    public List getMessge(String authKey) {

        // 1. 메시지 최신 기준 조회

        return null;
    }

    @Override
    public boolean setMessage(String authKey, String message) {

        // 1. message type 추출 - message 포맷 필요 (최초 입력 특수문자를 기준으로 분기 - enum 정리 필요)

        // 2. message type 별 데이터 처리 서비스 로직 호출
        // 메시지 저장 (메시지 타입, 메시지 데이터 타입, 메시지)

        return false;

    }

}

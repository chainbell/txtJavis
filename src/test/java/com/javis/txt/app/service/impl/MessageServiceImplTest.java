package com.javis.txt.app.service.impl;

import com.javis.txt.app.service.MessageService;
import com.javis.txt.domain.message.type.MessageType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MessageServiceImplTest {

    @Autowired
    MessageService messageService;

    @Test
    void setMessage(){
        boolean result = messageService.setMessage(1, MessageType.MESSAGE, "test message");
    }

}
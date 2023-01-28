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
        return null;
    }

    @Override
    public boolean setMessage(String authKey, String message) {
        return false;
    }

}

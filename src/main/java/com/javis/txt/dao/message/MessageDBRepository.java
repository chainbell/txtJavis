package com.javis.txt.dao.message;

import com.javis.txt.dao.message.repository.MessageInfoRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class MessageDBRepository {

    @Autowired
    MessageInfoRepository messageInfoRepository;

}

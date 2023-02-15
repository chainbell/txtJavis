package com.javis.txt.domain.message;


import com.javis.txt.common.util.TimeUtil;
import com.javis.txt.domain.message.type.MessageType;
import lombok.*;
import org.aspectj.bridge.Message;

/**
 * Message Domain Root
 * */

@Setter
@Getter
@ToString
public class MessageVO {

    /**
     * domain root key
     */
    String id;

    /**
     * message 타입
     * */
    MessageType type;

    /**
     * message 내용
     * */
    String data;

    @Builder
    public MessageVO(MessageType type, String data){
        this.type = type;
        this.data = data;
        this.id = "M_" + this.type + TimeUtil.getCurrentEpochMilli();
    }

}

package com.javis.txt.dao.message.entity;

import com.javis.txt.domain.message.type.MessageType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@ToString
@Entity
@Builder
@Table(name = "MessageInfo")
@NoArgsConstructor
public class MessageInfo {

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name="data", nullable = false)
    private String data;

    @Column(name="sender",  nullable = false)
    private int sender;

    @Column(name = "processFlag", nullable = false)
    private boolean processFlag;

   public MessageInfo(String id, String type, String data, int sender, boolean processFlag){
       this.id = id;
        this.type = type;
        this.data = data;
        this.sender = sender;
        this.processFlag = processFlag;
   }

}

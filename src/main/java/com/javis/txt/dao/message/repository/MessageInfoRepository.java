package com.javis.txt.dao.message.repository;

import com.javis.txt.dao.message.entity.MessageInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageInfoRepository extends JpaRepository<MessageInfo, String> {
}

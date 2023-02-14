package com.javis.txt.domain.message.type;

import lombok.Getter;

@Getter
public enum MessageType {
    MESSAGE/*일반 메시지*/,
    COMMAND/*내부 로직 명령어*/,
    SEARCH/*검색 명령어*/,
}

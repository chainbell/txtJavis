package com.javis.txt.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class AuthInfoDTO {

    boolean status;

    String authKey;

    String loginName;

}

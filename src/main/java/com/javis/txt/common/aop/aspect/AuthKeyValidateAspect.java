package com.javis.txt.common.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class AuthKeyValidateAspect {

    @Around("@within(com.javis.txt.common.aop.annotation.AuthKeyValidate)")
    public boolean isValidatedUser(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{

        // 1. authKey 조회 (request param or body)

        // 2. authKey decryption 확인 - (확인 로직은 user 도메인에 구현)

        return false;
    }

}

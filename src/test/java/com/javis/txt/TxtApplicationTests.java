package com.javis.txt;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TxtApplicationTests {

	@Test
	void contextLoads() {

	}

//	@Test
//	void test(){
//		String url = "jdbc:mariadb://mylifeis123.synology.me:3306/message?useSSL=false&useUnicode=true&serverTimezone=Asia/Seoul";
//		String username = "developer";
//		String password = "Roqkfgkqtlek12345!@";
//
//		System.out.println(jasyptEncoding(url));
//		System.out.println(jasyptEncoding(username));
//		System.out.println(jasyptEncoding(password));
//	}
//
//	public String jasyptEncoding(String value) {
//
//		String key = "sunrisdedyet";
//		StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
//		pbeEnc.setAlgorithm("PBEWithMD5AndDES");
//		pbeEnc.setPassword(key);
//		return pbeEnc.encrypt(value);
//	}


}

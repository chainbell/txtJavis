package com.javis.txt;

import com.javis.txt.common.util.CrawlerUtil;
import org.checkerframework.checker.units.qual.C;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TxtApplicationTests {

	@Test
	void contextLoads() {
		CrawlerUtil crawlerUtil = new CrawlerUtil();
		String url = "https://www.google.com/search?q=연관 검색어";
		crawlerUtil.getGoogleSearchList(url);
	}

}

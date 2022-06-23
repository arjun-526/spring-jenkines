package com.valmiki.jenkines.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringJenkinesApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinesApplicationTests.class);

	@Test
	public void contextLoads() {
		logger.info("Test case executing...");
		logger.info("Test case executing second log statement...");
		logger.info("Test case executing third log statement...");
		assertEquals(true, true);
	}

}

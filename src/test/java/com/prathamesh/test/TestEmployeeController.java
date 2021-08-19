package com.prathamesh.test;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Testable
public class TestEmployeeController {

private static final Logger log = LoggerFactory.getLogger(TestEmployeeController.class);

	@Test
	public void testSaveEmployee() {
     log.info("printed");
	}
}

package com.first.demo;

import org.springframework.stereotype.Repository;

import java.util.logging.Logger;

@Repository
public class DemoBean {

	private static final Logger logger = Logger.getGlobal();

	public void hello () {
		logger.info("Hello Spring !!!....");
	}
}

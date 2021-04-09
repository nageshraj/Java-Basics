package com.wolken.wolkenapp;

import org.apache.log4j.Logger;

public class LoggerTester {

	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger("LoggerTester");
		
		logger.debug("This is debug level");
		logger.error("This is error level");
		logger.fatal("This is fatal level");
		logger.info("This is info level");
		logger.trace("This is trace level");
		logger.warn("This is warn level");

	}

}

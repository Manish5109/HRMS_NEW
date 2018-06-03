package com.study.common.log;

import org.apache.log4j.Logger;

public class LogWriter {

	private final static Logger LOGGER = Logger.getLogger(LogWriter.class.getName());

	public static void main(String args[]) {
		for (int i = 0; i < 100; i++) {
			LOGGER.trace("hello trace");
			LOGGER.debug("hello debug");
			LOGGER.info("hello Info");
			// LOGGER.warn("hello warn");
			// LOGGER.error("hello error");
			// LOGGER.fatal("hello fatal");
		}

	}
}

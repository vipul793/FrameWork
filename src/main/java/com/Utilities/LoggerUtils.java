package com.Utilities;

import org.apache.log4j.PropertyConfigurator;

import freemarker.log.Logger;

public class LoggerUtils {

	static Logger log = Logger.getLogger("FrameworkExecution");

	public static void configuration() {
		PropertyConfigurator.configure("D:\\FrameWork\\TestData\\Log4J.properties");
	}

	public static void infomessage(String message) {
		log.info(message);
	}

	public static void errorMessage(String message) {
		log.error(message);
	}

	public static void debugMessage(String message) {
		log.debug(message);
	}

}
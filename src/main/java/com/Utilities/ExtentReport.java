package com.Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	public static ExtentReports report;
	public static ExtentTest test;

	public void configureReport() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("D:\\FrameWork\\Reports\\Report14092.html");
		report = new ExtentReports();
		report.attachReporter(reporter);

	}

	public static void createTest(String message) {
		test = report.createTest(message);
	}

	public static void testDetails(String authorName, String categoryName) {
		test.assignAuthor(authorName);
		test.assignCategory(categoryName);

	}

	public static void passTest(String message) {
		test.pass(message);

	}

	public static void failTest(String message) {
		test.fail(message);
	}

	public static void saveReport() {
		report.flush();
	}

}

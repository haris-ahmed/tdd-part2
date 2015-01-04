package com.tdd.xunit;

public class TestCaseTest {

	WasRun test = new WasRun("testMethod");
	
	public static void main(String[] args) {
		TestCaseTest t = new TestCaseTest();
		t.testWasRun();
		t.testSetUp();
		t.testRunning();
		t.testTemplateMethod();
		t.testResut();
	}
	
	public void testWasRun() {
		System.out.println(!test.wasRun);
		test.run();
		System.out.println(test.wasRun);
	}
	
	public void testSetUp() {
		test.run();
		System.out.println("setUp testMethod ".equals(test.log));
	}
	
	public void testRunning() {
		test.run();
		System.out.println(test.wasRun);
	}
	
	public void testTemplateMethod() {
		test.run();
		System.out.print("setUp testMethod tearDown ".equals(test.log));
	}
	
	public void testResut() {
		TestResult result = test.run();
		System.out.println("1 run, 0 failed".equals(result.summary()));
	}
	
	public void testResultFormatting() {
		TestResult result = new TestResult();
		result.testStarted();
		result.testFailed();
		System.out.println("1 run, 1 failed".equals(result.summary()));
	}
}

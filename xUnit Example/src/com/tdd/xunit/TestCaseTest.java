package com.tdd.xunit;

public class TestCaseTest {

	WasRun test = new WasRun("testMethod");
	
	public static void main(String[] args) {
		TestCaseTest t = new TestCaseTest();
		t.testWasRun();
		t.testSetUp();
		t.testRunning();
	}
	
	public void testWasRun() {
		System.out.println(!test.wasRun);
		test.run();
		System.out.println(test.wasRun);
	}
	
	public void testSetUp() {
		test.run();
		System.out.println(test.wasSetUp);
	}
	
	public void testRunning() {
		test.run();
		System.out.println(test.wasRun);
	}
}

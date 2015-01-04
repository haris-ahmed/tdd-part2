package com.tdd.xunit;

public class TestCaseTest {

	public static void main(String[] args) {
		TestCaseTest t = new TestCaseTest();
		t.testWasRun();
	}
	
	public void testWasRun() {
		WasRun test = new WasRun("testMethod");
		System.out.println(!test.wasRun);
		test.run();
		System.out.println(test.wasRun);
	}
}

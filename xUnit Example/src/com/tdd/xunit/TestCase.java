package com.tdd.xunit;

import java.lang.reflect.Method;

public class TestCase {

	String name;
	boolean wasSetUp = true;
	
	public TestCase(String name) {
		this.name = name;
	}
	
	public TestResult run() {
		TestResult result = new TestResult();
		result.testStarted();
		this.setUp();
		try {
			Method method = this.getClass().getMethod(this.name, null);
			method.invoke(this);
		} catch(Exception e) {
			e.printStackTrace();
		}
		this.tearDown();
		return result;
	}
	
	public void setUp() {
		
	}
	
	public void tearDown() {
		
	}
}

package com.tdd.xunit;

public class WasRun extends TestCase {

	boolean wasRun;
	boolean wasSetUp = true;
	String log;
	
	WasRun(String name) {
		super(name);
	}
	
	public void testMethod() {
		wasRun = true;
		log = log + "testMethod ";
		System.out.println(log);
	}
	
	public void setUp() {
		wasRun = false;
		wasSetUp = true;
		log = "setUp ";
		System.out.println(log);
	}
	
	public void tearDown() {
		log = log + "tearDown ";
		System.out.println(log);
	}
}

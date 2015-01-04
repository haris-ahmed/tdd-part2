package com.tdd.xunit;

public class WasRun extends TestCase {

	boolean wasRun;
	
	WasRun(String name) {
		super(name);
	}
	
	public void testMethod() {
		wasRun = true;
	}
}

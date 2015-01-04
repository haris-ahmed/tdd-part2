package com.tdd.xunit;

import java.lang.reflect.Method;

public class TestCase {

	String name;
	boolean wasSetUp = true;
	
	public TestCase(String name) {
		this.name = name;
	}
	
	public void run() {
		this.setUp();
		try {
			Method method = this.getClass().getMethod(this.name, null);
			method.invoke(this);
		} catch(Exception e) {
			e.printStackTrace();
		}
		this.tearDown();
	}
	
	public void setUp() {
		
	}
	
	public void tearDown() {
		
	}
}

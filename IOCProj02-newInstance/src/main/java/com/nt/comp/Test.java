package com.nt.comp;

public class Test {
	private int a = 10;
	private String b = "hello";

	private Test() {
		System.out.println("Test:: 0-param Constructor");
	}

	private Test(int a, String b) {
		System.out.println("Test:: 2-param constructor");
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}

}

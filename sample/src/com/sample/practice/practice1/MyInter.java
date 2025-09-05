package com.sample.practice.practice1;

public interface MyInter {
	default void printInter() {
		System.out.println(privateMethod()+"インターフェースのdefaultメソッド");
	}
	private String privateMethod() {
		return "privateメソッド,";
	}
	static void printInterStatic() {
		System.out.println(privateStaticMethod()+"インターフェースのstaticメソッド");
	}
	private static String privateStaticMethod() {
		return "privatestaticメソッド,";
	}

}

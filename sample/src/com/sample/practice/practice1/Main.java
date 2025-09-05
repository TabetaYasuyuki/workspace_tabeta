package com.sample.practice.practice1;

import java.util.ArrayList;
import java.util.List;

import com.sample.practice.practice2.MyClass;

public class Main extends MyClass {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>(List.of("A","B","C"));
		System.out.println(array);
		array.add("D");
		System.out.println(array);

		Main m = new Main();
		m.printInter();
		MyInter.printInterStatic();
		
		System.out.println("Eclipseからpush");

	}

}

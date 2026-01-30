package com.obs;

import java.io.IOException;

public class Test2child {
	public static void main(String[] args) throws IOException {
		System.out.println(Test1.getStringData(1, 0));
		System.out.println(Test1.getIntegerData(1, 1));
		System.out.println(Test1.getFloatData(2, 1));
		
	}
}

package com.itheima.servlet;

import java.util.ArrayList;
import java.util.List;

public class fanxing {
	public static <E> void printArray(E[] arrayPut){
		//Êä³ö
		for (E ele : arrayPut) {
			System.out.printf("%s", ele);
		}
		
	}
	
	public static void main(String args[]) {
		
/*		Integer[] inArray = {1,2,3,4};
		Double[] doubleArray = {1.1,2.2,3.3};
		Character[] charArray = {'H','E','L'};
		
		printArray(inArray);
		printArray(doubleArray);
		printArray(charArray);
		
		List<Integer> a=new ArrayList<Integer>();*/
		
		System.out.println(maximum(3,4,5));
		
		
	}
	
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		
		T max = x;
		System.out.println(x.getClass());
		if (z.compareTo(max) > 0) {
			max = z;
		}
		if (y.compareTo(y) > 0) {
			max = y;
		}
		return max;
		
	}

}

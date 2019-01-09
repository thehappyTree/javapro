package com.itheima.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		for (String str : list) {
			System.out.println(str);
			
		}
		
		String[] a = new String[list.size()];
		list.toArray(a);
		for (int i=0; i < a.length; i++) {
			System.out.println(a[i]);
			
			
		}
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		
		
		
	}

}

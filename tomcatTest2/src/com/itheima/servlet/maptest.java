package com.itheima.servlet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class maptest {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("1", "v1");
		map.put("2", "v2");
		map.put("3", "v3");
		
		for (String key : map.keySet()) {
			System.out.println(key+map.get(key));
			
		}
		Iterator<Map.Entry<String,String>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			System.out.print(entry.getKey()+entry.getValue());
			
		}
		
		for (Map.Entry<String,String> e : map.entrySet()) {
			
			System.out.print(e.getValue()+e.getKey());
			
		}
		

		
	}

}

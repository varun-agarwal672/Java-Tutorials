package testDemo;

import java.util.HashMap;
import java.util.HashSet;
//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//import java.util.List;

public class Addition {
	public static void main(String args[]) {
//		int arr[]=new int[2];
//		
//		arr[0]=1;
//		arr[1]=2;
//		
//		System.out.println(arr);
		
//		for(int i=0;i<10;i++) {
//			System.out.println(2*(i+1));
//		}
		
//		List<Integer> list = new ArrayList<Integer>(5);
//		
//		for(int i=1;i<=5;i++) {
//			list.add(2*i);
//		}
//		
//		System.out.println(list);
//		
//		System.out.println(list.get(3));
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("5");
		list .addLast("6");
		list.addFirst("4");
		
		list.remove(0);
		
		System.out.println(list);
		
		Set<String> set = new HashSet<String>(); 
		
		set.add("A");
		set.add("B");
		
		set.contains("C");
		
		System.out.println(set);
		
		for(String i : set) {
			System.out.println(i);
		}
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		
		System.out.println(map);
		
		if(map.containsKey("A")) {
			Integer a = map.get("A");
			System.out.println(a);
		}
		
		for(String key : map.keySet()) {
			System.out.println(key);
		}
		
		for(Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
	}
}

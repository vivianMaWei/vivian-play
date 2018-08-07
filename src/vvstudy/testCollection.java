package vvstudy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class testCollection {

	public static void main(String[] args) {

		testCollection tc = new testCollection();
		tc.testlist();
		tc.testSet();
		tc.testMap();

	}

	private void testMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "apple");
		map.put("2", "orange");
		map.put("3", "banana");
		map.put("1", "prich");
		
		System.out.println("The first way for map-------------------------------");
		
		for (String s : map.keySet()) {
			System.out.println("The key is: " + s);
			System.out.println("The value is: " + map.get(s));
		}
		
		System.out.println("The second way for map-------------------------------");

		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println("the key is: " + key);
			System.out.println("the key is: " + value);
		}

	}

	private void testSet() {
		Set<String> set = new HashSet<String>();
		set.add("I");
		set.add("get");
		set.add("up");
		set.add("early");
		System.out.println("the first way to output-----------------------------");
		for (String s : set)
			System.out.println(s);
		System.out.println("the second way to output-----------------------------");
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}

	private void testlist() {
		List<String> list = new ArrayList<String>();
		list.add("I");
		list.add("hate");
		list.add("bad");
		list.add("guy");
		for (String s : list)
			System.out.println(s);

	}

}
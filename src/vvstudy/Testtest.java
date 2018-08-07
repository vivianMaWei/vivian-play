package vvstudy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Testtest {
	public static void main(String[] args) {
		Testtest tt = new Testtest();
		// tt.testList();
		// tt.testSet();
		tt.testMap();

	}

	public void testList() {
		List<String> list = new ArrayList<String>();
		list.add("I");
		list.add("love");
		list.add("java");
		list.remove("I");
		for (String s : list)
			System.out.println(s);

	}

	public void testSet() {
		Set<String> set = new HashSet<String>();
		set.add("I");
		set.add("hate");
		set.add("study");
		set.remove("I");
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

	public void testMap() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(2, "stop");
		map.put(0, "really");
		map.put(4, "like");
		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			int key = it.next();
			String value = map.get(key);
			System.out.println("key is " + key + ",the value is " + value);
		}

	}
}

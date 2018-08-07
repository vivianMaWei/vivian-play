package vvstudy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sourceforge.htmlunit.corejs.javascript.ast.WhileLoop;

public class TC {

	public static void main(String[] args) {
		TC tc = new TC();
		tc.testList();
		tc.testSet();
		tc.testMap();

	}

	public void testSet() {
		Set<String> set = new HashSet<String>();
		set.add("t");
		set.add("o");
		set.add("p");
		// for (String s : set) {
		// System.out.println(s);
		// }

		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

	public void testList() {

	}

	public void testMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("2", "hello");
		map.put("1", "java");
		map.put("3", "program");

		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println("key=" + key + ",value=" + value);
		}
		
		for(String s:map.keySet()) {
			System.out.print("key="+s);
			System.out.println(",value="+map.get(s));
		}
	}

}

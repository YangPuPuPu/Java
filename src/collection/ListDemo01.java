package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo01 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		
		l.add("hello");
		l.add("央视记者");
		l.add("王冰冰");
		
		System.out.println(l);
		
		Iterator<String> it= l.iterator();
		
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}
}

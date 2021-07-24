package generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
 * 泛型的好处：把运行时期的问题提前到了编译时期
 * 			  避免了强制类型转换
 */
public class GenericDemo {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<>();
		
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//遍历
		Iterator<String> it = c.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}
}

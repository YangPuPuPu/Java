package collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 
 * 	Collection集合的常用方法：
 * 		boolean add(E e);添加元素
 * 		boolean remove(Object o);从集合中移除指定的元素
 * 		void clear();清空集合中的元素
 * 		boolean isEmpty();判断集合是否为空
 * 		int size();集合的长度，也就是集合中元素的个数
 */
public class CollectionDemo02 {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		
		//boolean add(E e);添加元素,返回值为true
		c.add("hello");
		c.add("java");
		c.add("world");
		
		//boolean remove(Object o);从集合中移除指定的元素,有为true无为false
		System.out.println(c.remove("java"));
		System.out.println(c.remove("javaee"));
		
		//void clear();清空集合中的元素
//		c.clear();
		
		//boolean isEmpty();判断集合是否为空
		System.out.println(c.isEmpty());
		
		//int size();集合的长度，也就是集合中元素的个数
		System.out.println(c.size());
		//输出集合元素
		System.out.println(c);
	}
}

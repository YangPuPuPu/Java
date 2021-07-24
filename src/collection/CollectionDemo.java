package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	public static void main(String[] args) {
		//创建对象
		Collection<String> c = new ArrayList<String>();
		//添加元素
		c.add("Hello");
		c.add("Java");
		c.add("World");
		//重写了toString方法
		System.out.println(c);
	}
}

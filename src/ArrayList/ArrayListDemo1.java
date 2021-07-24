package ArrayList;

import java.util.ArrayList;

/*
 * 		ArrayList构造方法：
 * 			public ArrayList();  创建一个空的集合对象
 * 
 * 		ArrayList添加方法：
 * 			public boolean add(E e)  将制定的元素追加到此集合的末尾
 * 			public void add(int index, E element);  在此集合中制定位置插入指定的元素
 */
public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		array.add("hello");
		array.add("world");
		array.add("java");
		System.out.println(array);
		array.add(1,"javase");
		array.add(4, "abc");
		//如果添加的元素在集合索引中间则其余元素往后移；
		//如果添加元素在集合索引末尾后一位，则在最后添加元素
		//如果添加元素索引大于最后一位元素索引+1，则集合越界，代码报错
		System.out.println(array);
	}
}

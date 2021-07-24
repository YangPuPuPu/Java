package collection;

import java.util.ArrayList;
import java.util.List;

/*
 * 	格式：
 * 		for(元素数据类型 变量名：数组或者Collection集合{
 * 			//在此处使用变量即可，该变量就是元素
 * 		}
 */
public class ForDemo {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		for(int i : arr) {
			System.out.println(i);
		}
		System.out.println("----------");
		String[] strArray = {"hello","world","java"};
			for(String s:strArray) {
				System.out.println(s);
			}
		System.out.println("----------");
		
		List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("world");
		list.add("java");
		for(String s:list) {
			System.out.println(s);
		}
		System.out.println("----------");
		//增强for其实内部就是一个Interator迭代器
//		for(String s:list) {
//			if(s.equals("world")) {//并发修改异常
//				list.add("javaee");//ConcurrentModificationException
//			}
//		}
		
	}
}

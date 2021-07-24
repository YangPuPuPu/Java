package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 	Collections类的概述：
 * 		是针对集合操作的工具类
 * 	Collections类的常用方法
 * 		public static <T extends Comparable<? super T>> void sort (List<T> list);将指定 的列表按照升序排序
 * 		public static void reverse (List<?> list);反转指定列表中元素的列表
 * 		public static void shuffle (List<?> list);使用默认的随机源随机排列指定的列表
*/
public class CollectionsDemo {
public static void main(String[] args) {
	//创建集合元素
	List<Integer> list = new ArrayList<Integer>();
	
	list.add(50);
	list.add(30);
	list.add(10);
	list.add(40);
	list.add(20);
	
	//public static <T extends Comparable<? super T>> void sort (List<T> list);将指定 的列表按照升序排序
	Collections.sort(list);
	System.out.println(list);
	Collections.reverse(list);
	System.out.println(list);
	Collections.shuffle(list);
	System.out.println(list);
}
}

package leixingtongpeifu;


import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ArgsDemo02 {
	public static void main(String[] args) {
		
/*		//Arrays工具类类中有一个静态方法：
		//public static <T> List<T> asList(T...a):返回由指定数组支持的固定大小列表
		List<String> list = Arrays.asList("hello","world","java");
//		list.add("javaee");//UnsupportedOperationException
//		list.remove(1);//UnsupportedOperationException
		list.set(1,"javaee");
		//返回的集合不能增删操作，可以做修改操作
		System.out.println(list);
		*/
		
/*		//List接口中有一个静态方法：
		//public static <E> list<E> of(E...elements):返回包含任意数量元素的不可变列表
		List<String> list1 = List.of("hello","world","java","hello");
//		list1.add("javaee");//UnsupportedOperationException
//		list1.remove(1);//UnsupportedOperationException
//		list1.set(1,"javaee");//UnsupportedOperationException
		//返回的集合不能做增删改操作
		System.out.println(list1);
		*/
		
		//Set接口中有一个静态方法:
		//public static <E> Set<E> of(E...elements):返回一个包含任意数量元素的不可变集合
//		Set<String> set = Set.of("java","hello","world","java");//IllegalArgumentException
//		Set<String> set = Set.of("java","hello","world");
//		set.add("javaee");//UnsupportedOperationException
//		set.remove(1);//UnsupportedOperationException
//		set.set(1,"javaee");//UnsupportedOperationException
		//返回的集合不能做增删操作，没有修改的办法
//		System.out.println(set);
	}
}

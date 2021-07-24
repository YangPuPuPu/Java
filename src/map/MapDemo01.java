package map;

import java.util.HashMap;
import java.util.Map;

/*
 * 	Map集合概述：
 * 		Interface Map<K,V>  K:键的类型；V：值的类型。
 * 		将键映射到值的对象，不能包含重复的键，每个键可以映射到最多一个值
 * 		举例，学生的学号和姓名
 * 				2019117026 杨璞
 * 
 * 	创建Map集合的对象
 * 		多态的方式
 * 		具体的实现类HashMap
 */ 
public class MapDemo01 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		
		//V put (K key,V value)将指定的值与该映射中的指定键相关联
		map.put("2019117026", "杨璞");
		map.put("2019117258", "张三");
		map.put("2019114123", "李四");
		map.put("2019117026", "杨小璞");//若key的值一样多次赋值则是覆盖之前的值
		//输出
		System.out.println(map);
		
	}
}

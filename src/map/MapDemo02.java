package map;

import java.util.HashMap;
import java.util.Map;

/*
 * 	Map集合的基本功能：
 * 		V put(K key,V value);添加元素
 * 		V remove(Object key); 根据键删除键值对元素
 * 		void clear(); 移除所有元素
 * 		boolean containsKey(Object key),判断集合是否含有指定的键
 * 		boolean containValue(Object value),盘算集合是否包含指定的值
 * 		boolean isEmpty():判断集合是否为空
 * 		int size(); 集合的长度，也就是集合中键值对的个数
 */
public class MapDemo02 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		//添加元素
		map.put("张无忌", "赵敏");
		map.put("郭靖", "黄蓉");
		map.put("杨过", "小龙女");
		
		//V remove(Object key); 根据键删除键值对元素
//		System.out.println(map.remove("郭靖"));//黄蓉
//		System.out.println(map.remove("郭襄"));//null
		
		//boolean containsKey(Object key),判断集合是否含有指定的键
//		System.out.println(map.containsKey("杨过"));
//		System.out.println(map.containsKey("郭襄"));
		
		//void clear(); 移除所有元素
//		map.clear();
		
		//boolean containValue(Object value),盘算集合是否包含指定的值
//		System.out.println("赵敏");
//		System.out.println("hs");
		
		//boolean isEmpty():判断集合是否为空
//		System.out.println(map.isEmpty());
		
		//int size(); 集合的长度，也就是集合中键值对的个数
		System.out.println(map.size());
		//输出map
		System.out.println(map);
	}
}

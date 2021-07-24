package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 	Map集合的获取功能：
 * 		V get(Object key);根据键获取值
 * 		Set<K> keySet();获取所有键的集合
 * 		Collection<V> values();//获取所有值的集合
 */
public class MapDemo03 {
	public static void main(String[] args) {
		//创建集合元素
		Map<String, String> map = new HashMap<>();
		
		//添加元素
		map.put("张无忌", "赵敏");
		map.put("郭靖", "黄蓉");
		map.put("杨过", "小龙女");
		
		//V get(Object key);根据键获取值
		System.out.println(map.get("杨过"));
		System.out.println(map.get("yp"));
		
		//Set<K> keySet();获取所有键的集合
		System.out.println(map.keySet());
		Set<String> set = map.keySet();
		for(String s:set) {
			System.out.println(s);
		}
		
		//Collection<V> values();//获取所有值的集合
		System.out.println(map.values());
		Collection<String> c = map.values();
		for(String s:c) {
			System.out.println(s);
		}
	}
}

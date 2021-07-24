package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map集合的遍历(方式2)：
 * 		1.获取键值对对象的集合
 * 			Set<Map.Entry<K,V>> entrySet();获取所有键值对对象的集合
 * 		2.遍历键值对对象的集合，得到每一个键值对对象
 * 			用增强for实现，得到每一个map.Entry
 * 		3.根据键值对对象获取键和值
 * 			用getkey()得到键
 * 			用getvalue()得到值
 */
public class MapDemo05 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		//添加元素
		map.put("张无忌", "赵敏");
		map.put("郭靖", "黄蓉");
		map.put("杨过", "小龙女");
		
		//获取键值对对象的集合
		Set<Map.Entry<String,String>> entrySet = map.entrySet();
		for(Map.Entry<String, String> me:entrySet) {
			String key = me.getKey();
			String value = me.getValue();
			System.out.println(key+","+value);
		}
	}
}

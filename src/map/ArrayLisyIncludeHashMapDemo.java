package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 * 需求：
 * 		创建一个ArrayList集合，存储三个元素，每一个元素都是HashMap，每一个HashMap的键和值都是String，并遍历
 */
public class ArrayLisyIncludeHashMapDemo {
	public static void main(String[] args) {
		ArrayList<HashMap<String,String>> array = new ArrayList<>();
		
		HashMap<String, String> hm1 = new HashMap<>();
		hm1.put("孙策", "大乔");
		hm1.put("周瑜", "小乔");
		array.add(hm1);
		
		HashMap<String, String> hm2 = new HashMap<>();
		hm2.put("郭靖", "黄蓉");
		hm2.put("杨过", "小龙女");
		array.add(hm2);
		
		HashMap<String, String> hm3 = new HashMap<>();
		hm3.put("令狐冲", "任盈盈");
		hm3.put("林平之", "岳灵珊");
		array.add(hm3);
		
		for(HashMap<String,String> hm:array) {
			Set<String> keySet = hm.keySet();
			for(String key:keySet) {
				String value = hm.get(key);
				System.out.println(key+","+value);
			}
		}
		System.out.println("-------------------");
		for(HashMap<String,String> hm:array) {
			Set<HashMap.Entry<String,String>> entrySet = hm.entrySet();
			for(HashMap.Entry<String,String> hme:entrySet) {
				String key = hme.getKey();
				String value = hme.getValue();
				System.out.println(key+","+value);
			}
		}
	}
}

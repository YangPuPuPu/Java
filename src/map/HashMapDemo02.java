package map;

import java.util.HashMap;
import java.util.Set;

/*
 * 需求：
 * 		创建一个HashMap集合，键是学生对象（Student），值是居住地（String），存储多个键值对元素，并遍历。
 * 		要求保证键的唯一性，如果学生对象的成员变量值相同，我们就认为是同一个对象
 */
public class HashMapDemo02 {
	public static void main(String[] args) {
		HashMap<Student1, String> hm = new HashMap<>();
		
		Student1 s1 = new Student1("张小三",18);
		Student1 s2 = new Student1("李小四",19);
		Student1 s3 = new Student1("杨小璞",20);
		Student1 s4 = new Student1("杨小璞",20);
		
		hm.put(s1, "襄阳");
		hm.put(s2, "武汉");
		hm.put(s3, "上海");
		hm.put(s4, "北京");
		
		Set<Student1> keySet = hm.keySet();
		for(Student1 key:keySet) {
			String value = hm.get(key);
			System.out.println(key.getName()+","+key.getAge()+","+value);
		}
		System.out.println("-------------");
		
		Set<HashMap.Entry<Student1, String>> entrySet = hm.entrySet();
		for(HashMap.Entry<Student1,String> me:entrySet) {
			Student1 key = me.getKey();
			String value = me.getValue();
			System.out.println(key.getName()+","+key.getAge()+","+value);
		}
	}
}

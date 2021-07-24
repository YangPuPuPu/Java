package map;

import java.util.HashMap;
import java.util.Set;

/*
 * ����
 * 		����һ��HashMap���ϣ�����ѧ��(String),ֵ��ѧ������(Student),�洢3��ѧ������
 */
public class MapText01 {
	public static void main(String[] args) {
		HashMap<String, Student> hm = new HashMap<>();
		
		Student s1 = new Student("��С��",18);
		Student s2 = new Student("��С��",19);
		Student s3 = new Student("��С�",20);
		
		hm.put("2019117024", s1);
		hm.put("2019117023", s2);
		hm.put("2019117026", s3);
		
		Set<String> keyset = hm.keySet();
		for(String key:keyset) {
			Student value = hm.get(key);
			System.out.println(key+","+value.getName()+","+value.getAge());
		}
		System.out.println("-------------------");
		
		Set<HashMap.Entry<String,Student>> entrySet = hm.entrySet();
		for(HashMap.Entry<String,Student> me: entrySet) {
			String key = me.getKey();
			Student s = me.getValue();
			System.out.println(key+","+s.getName()+","+s.getAge());
		}
	}
}

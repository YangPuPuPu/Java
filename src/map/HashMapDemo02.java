package map;

import java.util.HashMap;
import java.util.Set;

/*
 * ����
 * 		����һ��HashMap���ϣ�����ѧ������Student����ֵ�Ǿ�ס�أ�String�����洢�����ֵ��Ԫ�أ���������
 * 		Ҫ��֤����Ψһ�ԣ����ѧ������ĳ�Ա����ֵ��ͬ�����Ǿ���Ϊ��ͬһ������
 */
public class HashMapDemo02 {
	public static void main(String[] args) {
		HashMap<Student1, String> hm = new HashMap<>();
		
		Student1 s1 = new Student1("��С��",18);
		Student1 s2 = new Student1("��С��",19);
		Student1 s3 = new Student1("��С�",20);
		Student1 s4 = new Student1("��С�",20);
		
		hm.put(s1, "����");
		hm.put(s2, "�人");
		hm.put(s3, "�Ϻ�");
		hm.put(s4, "����");
		
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

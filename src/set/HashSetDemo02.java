package set;

import java.util.HashSet;

/*
 * 	���󣺴���һ������ѧ������ļ��ϣ��洢����ѧ������ʹ�ó���ʵ���ڿ���̨�����ü���
 * 		 Ҫ��ѧ��˵�ع��������ֵ��ͬ���Ǿ���Ϊ��ͬһ���ҡ�
 */
public class HashSetDemo02 {
	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<>();
		
		Student s1 = new Student("����",19);
		Student s2 = new Student("����",18);
		Student s3 = new Student("����",20);
		Student s4 = new Student("����",19);
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		
		for(Student s:hs) {
			System.out.println(s.getName()+","+s.getAge());
		}
		
	}
}

package ArrayList;

import java.util.ArrayList;

/*
 * ����һ������ѧ������ļ��ϣ��洢����ѧ������ͨ������̨�����ü���
 */

public class ArrayListText02 {
	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();
		
		Student s1 = new Student("���",19);
		Student s2 = new Student("������",18);
		Student s3 = new Student("˫��",20);
		
		array.add(s1);
		array.add(s2);
		array.add(s3);
		
		for(int i=0;i<array.size();i++) {
			Student s = array.get(i);
			System.out.println(s.getName()+","+s.getAge());
		}
	}
}

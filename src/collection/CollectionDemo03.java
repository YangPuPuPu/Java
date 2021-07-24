package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ������
 */
public class CollectionDemo03 {
	public static void main(String[] args) {
		Collection<Student> c = new ArrayList<Student>();
		
		//����ѧ������
		Student s1 = new Student("����",15);
		Student s2 = new Student("����",18);
		Student s3 = new Student("����",19);
		
		c.add(s1);
		c.add(s2);
		c.add(s3);
		
		//��������������
		Iterator<Student> it= c.iterator();
		
		//ʹ�õ������ķ�����������Ԫ��
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s.getName()+","+s.getAge());
		}
	}
}

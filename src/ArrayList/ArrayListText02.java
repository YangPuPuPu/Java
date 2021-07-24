package ArrayList;

import java.util.ArrayList;

/*
 * 创建一个储存学生对象的集合，存储三个学生对象，通过控制台遍历该集合
 */

public class ArrayListText02 {
	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();
		
		Student s1 = new Student("杨璞",19);
		Student s2 = new Student("尹延龙",18);
		Student s3 = new Student("双笙",20);
		
		array.add(s1);
		array.add(s2);
		array.add(s3);
		
		for(int i=0;i<array.size();i++) {
			Student s = array.get(i);
			System.out.println(s.getName()+","+s.getAge());
		}
	}
}

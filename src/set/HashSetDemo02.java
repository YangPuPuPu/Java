package set;

import java.util.HashSet;

/*
 * 	需求：创建一个储存学生对象的集合，存储三个学生对象，使用程序实现在控制台遍历该集合
 * 		 要求：学会说呢过对象变量值相同我们就认为是同一个家。
 */
public class HashSetDemo02 {
	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<>();
		
		Student s1 = new Student("张三",19);
		Student s2 = new Student("李四",18);
		Student s3 = new Student("王五",20);
		Student s4 = new Student("张三",19);
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		
		for(Student s:hs) {
			System.out.println(s.getName()+","+s.getAge());
		}
		
	}
}

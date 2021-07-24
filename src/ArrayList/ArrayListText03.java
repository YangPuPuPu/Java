package ArrayList;

import java.util.ArrayList;

import java.util.Scanner;
/*
 * 创建一个储存学生对象的集合，存储三个学生对象，通过控制台遍历该集合(升级版)*****************
 */

public class ArrayListText03 {
	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();
		
		addStudent(array);
		addStudent(array);
		addStudent(array);
		
		for(int i=0;i<array.size();i++) {
			Student s = array.get(i);
			System.err.println(s.getName()+","+s.getAge());
		}
	}
	public static void addStudent(ArrayList array) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入姓名：");
		String ss = sc.nextLine();
		System.out.println("请输入年龄：");
		int i = sc.nextInt();
		
		Student s= new Student();
		s.setName(ss);
		s.setAge(i);
		
		array.add(s);
	}
}

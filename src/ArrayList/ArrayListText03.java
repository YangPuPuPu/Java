package ArrayList;

import java.util.ArrayList;

import java.util.Scanner;
/*
 * ����һ������ѧ������ļ��ϣ��洢����ѧ������ͨ������̨�����ü���(������)*****************
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
		System.out.println("������������");
		String ss = sc.nextLine();
		System.out.println("���������䣺");
		int i = sc.nextInt();
		
		Student s= new Student();
		s.setName(ss);
		s.setAge(i);
		
		array.add(s);
	}
}

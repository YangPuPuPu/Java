package set;

import java.util.TreeSet;

/*
 * 		�洢ѧ�����󲢱�������������ʹ���޲ι��췽��
 * 		Ҫ�󣺰��������С��������������ͬʱ������������ĸ˳������
 */
public class TreeSetDemo02 {
	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<>();
		
		Student s1 = new Student("xishi",29);
		Student s2 = new Student("wangzhaojun",28);
		Student s3 = new Student("diaochan",30);
		Student s4 = new Student("yangyuhuan",33);
		Student s5 = new Student("linqingxia",33);
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		for(Student s:ts) {
			System.out.println(s.getName()+","+s.getAge());
		}
	}
}

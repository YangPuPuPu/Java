package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo03 {
	public static void main(String[] args) {
		List<Student> l= new ArrayList<>();
		
		Student s1 = new Student("张三",15);
		Student s2 = new Student("李四",18);
		Student s3 = new Student("王五",19);
		
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		//迭代器遍历
		Iterator<Student> it = l.iterator();
		while(it.hasNext()) {
			Student s= it.next();
			System.out.println(s.getName()+","+s.getAge());
		}
		System.out.println("---------");
		
		//循环遍历
		for(int i =0;i<l.size();i++) {
			Student s = l.get(i);
			System.out.println(s.getName()+","+s.getAge());
		}
	}
}

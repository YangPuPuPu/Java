package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import set.Student;

/*
 * 需求：
 * 		ArrayList存储学生对象，使用Collections对ArrayList进行排序
 * 		要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
 * 
 */
public class CollectionsDemo02 {
	public static void main(String[] args) {
		//创建ArrayList集合对象
		ArrayList<Student> array  = new ArrayList<>();
		
		//创建学生对象
		Student s1 = new Student("xishi",29);
		Student s2 = new Student("wangzhaojun",28);
		Student s3 = new Student("diaochan",30);
		Student s4 = new Student("yangyuhuan",33);
		Student s5 = new Student("linqingxia",33);
		
		//把学生添加到集合
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		array.add(s5);
		
		//使用Collections对ArrayList进行排序
		//sort​(List<T> list, Comparator<? super T> c);
		Collections.sort(array,new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				int num = s1.getAge()-s2.getAge();
				int num2 = num==0?s1.getName().compareTo(s2.getName()):num;
				return num2;
			}
		});
		for(Student s: array) {
			System.out.println(s.getName()+","+s.getAge());
		}
	}
}

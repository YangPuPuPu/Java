package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 测试类
 */
public class CollectionDemo03 {
	public static void main(String[] args) {
		Collection<Student> c = new ArrayList<Student>();
		
		//创建学生对象
		Student s1 = new Student("张三",15);
		Student s2 = new Student("李四",18);
		Student s3 = new Student("王五",19);
		
		c.add(s1);
		c.add(s2);
		c.add(s3);
		
		//创建迭代器对象
		Iterator<Student> it= c.iterator();
		
		//使用迭代器的方法遍历集合元素
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s.getName()+","+s.getAge());
		}
	}
}

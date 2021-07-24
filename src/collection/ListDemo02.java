package collection;

import java.util.ArrayList;
import java.util.List;

/*
 * 	List集合特有方法：
 * 		void add(int index,E element);在此集合中的指定位置插入指定的元素
 * 		E remove(int index),删除指定索引处的元素，返回被删除的元素
 * 		E set(int index,E element),修改指定索引处的元素，返回被修改的元素
 * 		E get(int index);返回指定索引处的元素
 * 
 */
public class ListDemo02 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		
		l.add("hello");
		l.add("央视记者");
		l.add("王冰冰");
		
		//void add(int index,E element);在此集合中的指定位置插入指定的元素
//		l.add(1,"hello");
//		l.add(11,"hello");//IndexOutOfBoundsException索引越界
		
		//E remove(int index),删除指定索引处的元素，返回被删除的元素
//		l.remove(1);
//		l.remove(11);//IndexOutOfBoundsException索引越界
		
		//E set(int index,E element),修改指定索引处的元素，返回被修改的元素
//		l.set(1, "王冰冰");
//		l.set(11, w);//IndexOutOfBoundsException索引越界
		
		//E get(int index);返回指定索引处的元素
		System.out.println(l.get(2));
		
		//遍历的第二种方法
		for(int i =0;i<l.size();i++) {
			String  s=l.get(i);
			System.out.println(s);
		}
		System.out.println(l);
	}
}

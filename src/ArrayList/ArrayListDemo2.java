package ArrayList;

import java.util.ArrayList;
public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		array.add("Hello");
		array.add("world");
		array.add("java");
		//public boolean remove(Object o); 删除指定元素 返回删除是否成功。
//		System.out.println(array.remove("world"));//true
//		System.out.println(array.remove("javase"));//false
		
		//public E remove(int index); 删除指定索引处的元素，返回被删除的元素
//		System.out.println(array.remove(1));//删除了一个world
//		System.out.println(3);//集合越界索引
		
		//public E set(int index, E element); 修改指定索引处的元素，返回被修改的元素
//		System.out.println(array.set(1, "javase"));
//		System.out.println(3,"javase");//集合越界，索引越界
		
		//public E get(int index); 返回指定索引处的元素
//		System.out.println(array.get(1));
//		System.out.println(array.get(3));//集合越界，索引越界
		
		//pulic int size(); f返回集合元素个数
		System.out.println(array.size());
		
		System.out.println(array);
	}
}

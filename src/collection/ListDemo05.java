package collection;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * �ֱ�ʹ��ArrayList��LinkedList����ַ����洢������
 */
public class ListDemo05 {
	public static void main(String[] args) {
		//�������϶���
		ArrayList<String> array= new ArrayList<>();
		array.add("hello");
		array.add("world");
		array.add("java");
		
		for(String s:array) {
			System.out.println(s);
		}
		System.out.println("-----------");
		
		LinkedList<String> linkedList= new LinkedList<>();
		linkedList.add("hello");
		linkedList.add("world");
		linkedList.add("java");
		for(String s:linkedList) {
			System.out.println(s);
		}
	}
}

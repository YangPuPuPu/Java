package collection;

import java.util.ArrayList;
import java.util.List;

/*
 * 	��ʽ��
 * 		for(Ԫ���������� ���������������Collection����{
 * 			//�ڴ˴�ʹ�ñ������ɣ��ñ�������Ԫ��
 * 		}
 */
public class ForDemo {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		for(int i : arr) {
			System.out.println(i);
		}
		System.out.println("----------");
		String[] strArray = {"hello","world","java"};
			for(String s:strArray) {
				System.out.println(s);
			}
		System.out.println("----------");
		
		List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("world");
		list.add("java");
		for(String s:list) {
			System.out.println(s);
		}
		System.out.println("----------");
		//��ǿfor��ʵ�ڲ�����һ��Interator������
//		for(String s:list) {
//			if(s.equals("world")) {//�����޸��쳣
//				list.add("javaee");//ConcurrentModificationException
//			}
//		}
		
	}
}

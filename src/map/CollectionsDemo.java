package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 	Collections��ĸ�����
 * 		����Լ��ϲ����Ĺ�����
 * 	Collections��ĳ��÷���
 * 		public static <T extends Comparable<? super T>> void sort (List<T> list);��ָ�� ���б�����������
 * 		public static void reverse (List<?> list);��תָ���б���Ԫ�ص��б�
 * 		public static void shuffle (List<?> list);ʹ��Ĭ�ϵ����Դ�������ָ�����б�
*/
public class CollectionsDemo {
public static void main(String[] args) {
	//��������Ԫ��
	List<Integer> list = new ArrayList<Integer>();
	
	list.add(50);
	list.add(30);
	list.add(10);
	list.add(40);
	list.add(20);
	
	//public static <T extends Comparable<? super T>> void sort (List<T> list);��ָ�� ���б�����������
	Collections.sort(list);
	System.out.println(list);
	Collections.reverse(list);
	System.out.println(list);
	Collections.shuffle(list);
	System.out.println(list);
}
}

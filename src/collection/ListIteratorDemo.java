package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * 	ListIterator:�б������
 * 		ͨ��list���ϵ�listIterator()�����õ�������˵����list�������еĵ�����
 * 		�����������Ա����һ��������б���б���������ڵ����ڼ��޸��б�����ȡ�б��е������ĵ�ǰλ��
 * 
 * 	listIterator�еĳ��÷���
 * 		E next(),���ص����е���һ��Ԫ��
 * 		boolean hasNext();����������и���Ԫ�أ��򷵻�true
 * 		E previous ();�����б��е���һ��Ԫ��
 * 		boolean hasPrevious();������б���������෴��������б��Ǿ��и���Ԫ�أ��򷵻�true
 * 		void add(E e);��ָ����Ԫ�ز����б�
 */
public class ListIteratorDemo {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		
		//���Ԫ��
		l.add("hello");
		l.add("world");
		l.add("java");
		
		//ͨ��list���ϵ�listIterator()�����õ�
//		ListIterator<String> lit = l.listIterator();
//		while(lit.hasNext()) {
//			String s = lit.next();
//			System.out.println(s);
//		}
//		System.out.println("-----------");
//		
//		while(lit.hasPrevious()) {
//			String s = lit.previous();
//			System.out.println(s);
//		}
		
		//��ȡ�б������
		ListIterator<String> lit = l.listIterator();
		while(lit.hasNext()) {
			String s = lit.next();
			if(s.equals("world")) {
				lit.add("javaee");
			}
		}
		System.out.println(l);
	}
}

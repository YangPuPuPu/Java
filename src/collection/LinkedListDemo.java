package collection;

import java.util.LinkedList;
/*
 * LinkedList���ϵ����ⷽ����
 * 		public void addFirst(E e);�ڸ��б�ͷ�����ƶ���Ԫ��
 * 		public void addLast(E e);��ָ����Ԫ��׷�ӵ����б��ĩβ
 * 		public E getFirst();���ش��б�ĵ�һ��Ԫ��
 * 		public E getLast();���ش��б�����һ��Ԫ��
 * 		public E removeFirst();�Ӵ��б���ɾ�������ص�һ��Ԫ��
 * 		public E removeLast();�Ӵ��б���ɾ�����������һ��Ԫ��
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		
		linkedList.add("hello");
		linkedList.add("world");
		linkedList.add("java");
		
//		public void addFirst(E e);�ڸ��б�ͷ�����ƶ���Ԫ��
//		public void addLast(E e);��ָ����Ԫ��׷�ӵ����б��ĩβ
//		linkedList.addFirst("javaee");
//		linkedList.addLast("javase");
		
//		public E getFirst();���ش��б�ĵ�һ��Ԫ��
//		public E getLast();���ش��б�����һ��Ԫ��\
//		System.out.println(linkedList.getFirst());
//		System.out.println(linkedList.getLast());
		
//		public E removeFirst();�Ӵ��б���ɾ�������ص�һ��Ԫ��
//		public E removeLast();�Ӵ��б���ɾ�����������һ��Ԫ��
//		System.out.println(linkedList.removeFirst());
//		System.out.println(linkedList.removeLast());
		
		
		System.out.println(linkedList);
	}
}

package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 
 * 		Iterator:������������ר�ñ�����ʽ
 * 		Iterator<E> Iterator(),���ش˼��Ϻ���Ԫ�صĵ�������ͨ�����ϵ�iterator()�����õ�
 * 		��������ͨ�����ϵ�iterator()�����õ�����������˵���������ڼ��϶����ڵ�
 		
 		Iterator�еĳ��÷���
 			E next();���ص����е���һ��Ԫ��
 			boolean hasNext();����������и����Ԫ�أ��򷵻�true
 */
public class IteratorDemo {
	public static void main(String[] args) {
		//�������϶���
		Collection<String> c= new ArrayList<String>();
		
		//��Ӽ���Ԫ��
		c.add("hello");
		c.add("java");
		c.add("world");
		
		//���ش˼��Ϻ���Ԫ�صĵ�������ͨ�����ϵ�iterator()�����õ�
		Iterator<String> it = c.iterator();
		
//		//E next();���ص����е���һ��Ԫ��
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());//NoSuchElementException:��ʾ�������Ԫ�ز�����
	
		while(it.hasNext()) {
//			System.out.println(it.next());
			String s = it.next();
			System.out.println(s);
		}
	}
}

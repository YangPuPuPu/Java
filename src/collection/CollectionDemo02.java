package collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 
 * 	Collection���ϵĳ��÷�����
 * 		boolean add(E e);���Ԫ��
 * 		boolean remove(Object o);�Ӽ������Ƴ�ָ����Ԫ��
 * 		void clear();��ռ����е�Ԫ��
 * 		boolean isEmpty();�жϼ����Ƿ�Ϊ��
 * 		int size();���ϵĳ��ȣ�Ҳ���Ǽ�����Ԫ�صĸ���
 */
public class CollectionDemo02 {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		
		//boolean add(E e);���Ԫ��,����ֵΪtrue
		c.add("hello");
		c.add("java");
		c.add("world");
		
		//boolean remove(Object o);�Ӽ������Ƴ�ָ����Ԫ��,��Ϊtrue��Ϊfalse
		System.out.println(c.remove("java"));
		System.out.println(c.remove("javaee"));
		
		//void clear();��ռ����е�Ԫ��
//		c.clear();
		
		//boolean isEmpty();�жϼ����Ƿ�Ϊ��
		System.out.println(c.isEmpty());
		
		//int size();���ϵĳ��ȣ�Ҳ���Ǽ�����Ԫ�صĸ���
		System.out.println(c.size());
		//�������Ԫ��
		System.out.println(c);
	}
}

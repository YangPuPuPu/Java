package collection;

import java.util.ArrayList;
import java.util.List;

/*
 * 	List�������з�����
 * 		void add(int index,E element);�ڴ˼����е�ָ��λ�ò���ָ����Ԫ��
 * 		E remove(int index),ɾ��ָ����������Ԫ�أ����ر�ɾ����Ԫ��
 * 		E set(int index,E element),�޸�ָ����������Ԫ�أ����ر��޸ĵ�Ԫ��
 * 		E get(int index);����ָ����������Ԫ��
 * 
 */
public class ListDemo02 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		
		l.add("hello");
		l.add("���Ӽ���");
		l.add("������");
		
		//void add(int index,E element);�ڴ˼����е�ָ��λ�ò���ָ����Ԫ��
//		l.add(1,"hello");
//		l.add(11,"hello");//IndexOutOfBoundsException����Խ��
		
		//E remove(int index),ɾ��ָ����������Ԫ�أ����ر�ɾ����Ԫ��
//		l.remove(1);
//		l.remove(11);//IndexOutOfBoundsException����Խ��
		
		//E set(int index,E element),�޸�ָ����������Ԫ�أ����ر��޸ĵ�Ԫ��
//		l.set(1, "������");
//		l.set(11, w);//IndexOutOfBoundsException����Խ��
		
		//E get(int index);����ָ����������Ԫ��
		System.out.println(l.get(2));
		
		//�����ĵڶ��ַ���
		for(int i =0;i<l.size();i++) {
			String  s=l.get(i);
			System.out.println(s);
		}
		System.out.println(l);
	}
}

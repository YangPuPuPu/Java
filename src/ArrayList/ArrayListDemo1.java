package ArrayList;

import java.util.ArrayList;

/*
 * 		ArrayList���췽����
 * 			public ArrayList();  ����һ���յļ��϶���
 * 
 * 		ArrayList��ӷ�����
 * 			public boolean add(E e)  ���ƶ���Ԫ��׷�ӵ��˼��ϵ�ĩβ
 * 			public void add(int index, E element);  �ڴ˼������ƶ�λ�ò���ָ����Ԫ��
 */
public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		array.add("hello");
		array.add("world");
		array.add("java");
		System.out.println(array);
		array.add(1,"javase");
		array.add(4, "abc");
		//�����ӵ�Ԫ���ڼ��������м�������Ԫ�������ƣ�
		//������Ԫ���ڼ�������ĩβ��һλ������������Ԫ��
		//������Ԫ�������������һλԪ������+1���򼯺�Խ�磬���뱨��
		System.out.println(array);
	}
}

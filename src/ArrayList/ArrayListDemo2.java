package ArrayList;

import java.util.ArrayList;
public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		array.add("Hello");
		array.add("world");
		array.add("java");
		//public boolean remove(Object o); ɾ��ָ��Ԫ�� ����ɾ���Ƿ�ɹ���
//		System.out.println(array.remove("world"));//true
//		System.out.println(array.remove("javase"));//false
		
		//public E remove(int index); ɾ��ָ����������Ԫ�أ����ر�ɾ����Ԫ��
//		System.out.println(array.remove(1));//ɾ����һ��world
//		System.out.println(3);//����Խ������
		
		//public E set(int index, E element); �޸�ָ����������Ԫ�أ����ر��޸ĵ�Ԫ��
//		System.out.println(array.set(1, "javase"));
//		System.out.println(3,"javase");//����Խ�磬����Խ��
		
		//public E get(int index); ����ָ����������Ԫ��
//		System.out.println(array.get(1));
//		System.out.println(array.get(3));//����Խ�磬����Խ��
		
		//pulic int size(); f���ؼ���Ԫ�ظ���
		System.out.println(array.size());
		
		System.out.println(array);
	}
}

package leixingtongpeifu;


import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ArgsDemo02 {
	public static void main(String[] args) {
		
/*		//Arrays������������һ����̬������
		//public static <T> List<T> asList(T...a):������ָ������֧�ֵĹ̶���С�б�
		List<String> list = Arrays.asList("hello","world","java");
//		list.add("javaee");//UnsupportedOperationException
//		list.remove(1);//UnsupportedOperationException
		list.set(1,"javaee");
		//���صļ��ϲ�����ɾ�������������޸Ĳ���
		System.out.println(list);
		*/
		
/*		//List�ӿ�����һ����̬������
		//public static <E> list<E> of(E...elements):���ذ�����������Ԫ�صĲ��ɱ��б�
		List<String> list1 = List.of("hello","world","java","hello");
//		list1.add("javaee");//UnsupportedOperationException
//		list1.remove(1);//UnsupportedOperationException
//		list1.set(1,"javaee");//UnsupportedOperationException
		//���صļ��ϲ�������ɾ�Ĳ���
		System.out.println(list1);
		*/
		
		//Set�ӿ�����һ����̬����:
		//public static <E> Set<E> of(E...elements):����һ��������������Ԫ�صĲ��ɱ伯��
//		Set<String> set = Set.of("java","hello","world","java");//IllegalArgumentException
//		Set<String> set = Set.of("java","hello","world");
//		set.add("javaee");//UnsupportedOperationException
//		set.remove(1);//UnsupportedOperationException
//		set.set(1,"javaee");//UnsupportedOperationException
		//���صļ��ϲ�������ɾ������û���޸ĵİ취
//		System.out.println(set);
	}
}

package set;

import java.util.HashSet;
import java.util.Set;

/*
 * 	Set�����ص�
 * 		�������ظ�Ԫ�صļ���
 * 		û�д������ķ��������Բ���ʹ����ͨforѭ������
 * 
 * 	HashSet:
 * 		�Լ��ϵĵ���˳�����κα�֤
 */
public class SetDemo {
	public static void main(String[] args) {
		//�������϶���
		Set<String> set = new HashSet<>();
		
		//���Ԫ��
		set.add("hello");
		set.add("world");
		set.add("java");
		//����ظ�Ԫ��
		set.add("world");
		
		//����
		for(String s:set) {
			System.out.println(s);
		}
	}
}

package set;

import java.util.LinkedHashSet;

/*
 * 	LinkedHashSet�����ص㣺
 * 		1.��ϣ�������ʵ�ֵ�set�ӿڣ����п�Ԥ��ĵ�������
 * 		2.������֤Ԫ������Ҳ����˵Ԫ�صĴ洢��ȡ��˳����һ�µ�
 * 		3.�ɹ�ϣ��֤Ԫ��Ψһ��Ҳ����˵û���ظ���Ԫ��
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		
		lhs.add("hello");
		lhs.add("world");
		lhs.add("java");
		lhs.add("hello");
		
		for(String s:lhs) {
			System.out.println(s);
		}
	}
}

package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	public static void main(String[] args) {
		//��������
		Collection<String> c = new ArrayList<String>();
		//���Ԫ��
		c.add("Hello");
		c.add("Java");
		c.add("World");
		//��д��toString����
		System.out.println(c);
	}
}

package ArrayList;

import java.util.ArrayList;

/*
 * ���ϴ洢�ַ�����������
 */
public class ArrayListText01 {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		array.add("С��");
		array.add("��ѧ");
		array.add("java");
		for(int i=0;i<array.size();i++) {
			String s = array.get(i);
			System.out.println(s);
		}
	}
}

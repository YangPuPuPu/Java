package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 * ���󣺴���һ��HashMap���ϣ��洢������ֵ��Ԫ�أ�ÿһ����ֵ��Ԫ�صļ���String��ֵ��ArrayList
 * 		ÿһ��ArrayList��Ԫ����String��������
 */
public class HashMapIncludeArrayListDemo {
	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> hm = new HashMap<>();
		
		ArrayList<String> sgyy= new ArrayList<>();
		sgyy.add("�����");
		sgyy.add("����");
		hm.put("��������", sgyy);
		
		ArrayList<String> xyj= new ArrayList<>();
		xyj.add("��ɮ");
		xyj.add("�����");
		hm.put("���μ�", xyj);
		
		ArrayList<String> shz= new ArrayList<>();
		shz.add("����");
		shz.add("³����");
		hm.put("ˮ䰴�", shz);
		
		Set<String> keyset = hm.keySet();
		for(String key:keyset) {
			System.out.println(key);
			ArrayList<String> value =hm.get(key);
			for(String s: value) {
				System.out.println("\t"+s);
			}
		}
	}
}

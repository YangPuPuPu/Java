package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 * ����
 * 		����һ��ArrayList���ϣ��洢����Ԫ�أ�ÿһ��Ԫ�ض���HashMap��ÿһ��HashMap�ļ���ֵ����String��������
 */
public class ArrayLisyIncludeHashMapDemo {
	public static void main(String[] args) {
		ArrayList<HashMap<String,String>> array = new ArrayList<>();
		
		HashMap<String, String> hm1 = new HashMap<>();
		hm1.put("���", "����");
		hm1.put("���", "С��");
		array.add(hm1);
		
		HashMap<String, String> hm2 = new HashMap<>();
		hm2.put("����", "����");
		hm2.put("���", "С��Ů");
		array.add(hm2);
		
		HashMap<String, String> hm3 = new HashMap<>();
		hm3.put("�����", "��ӯӯ");
		hm3.put("��ƽ֮", "����ɺ");
		array.add(hm3);
		
		for(HashMap<String,String> hm:array) {
			Set<String> keySet = hm.keySet();
			for(String key:keySet) {
				String value = hm.get(key);
				System.out.println(key+","+value);
			}
		}
		System.out.println("-------------------");
		for(HashMap<String,String> hm:array) {
			Set<HashMap.Entry<String,String>> entrySet = hm.entrySet();
			for(HashMap.Entry<String,String> hme:entrySet) {
				String key = hme.getKey();
				String value = hme.getValue();
				System.out.println(key+","+value);
			}
		}
	}
}

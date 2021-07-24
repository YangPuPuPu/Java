package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 	Map���ϵĻ�ȡ���ܣ�
 * 		V get(Object key);���ݼ���ȡֵ
 * 		Set<K> keySet();��ȡ���м��ļ���
 * 		Collection<V> values();//��ȡ����ֵ�ļ���
 */
public class MapDemo03 {
	public static void main(String[] args) {
		//��������Ԫ��
		Map<String, String> map = new HashMap<>();
		
		//���Ԫ��
		map.put("���޼�", "����");
		map.put("����", "����");
		map.put("���", "С��Ů");
		
		//V get(Object key);���ݼ���ȡֵ
		System.out.println(map.get("���"));
		System.out.println(map.get("yp"));
		
		//Set<K> keySet();��ȡ���м��ļ���
		System.out.println(map.keySet());
		Set<String> set = map.keySet();
		for(String s:set) {
			System.out.println(s);
		}
		
		//Collection<V> values();//��ȡ����ֵ�ļ���
		System.out.println(map.values());
		Collection<String> c = map.values();
		for(String s:c) {
			System.out.println(s);
		}
	}
}

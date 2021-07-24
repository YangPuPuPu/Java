package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map���ϵı���(��ʽ2)��
 * 		1.��ȡ��ֵ�Զ���ļ���
 * 			Set<Map.Entry<K,V>> entrySet();��ȡ���м�ֵ�Զ���ļ���
 * 		2.������ֵ�Զ���ļ��ϣ��õ�ÿһ����ֵ�Զ���
 * 			����ǿforʵ�֣��õ�ÿһ��map.Entry
 * 		3.���ݼ�ֵ�Զ����ȡ����ֵ
 * 			��getkey()�õ���
 * 			��getvalue()�õ�ֵ
 */
public class MapDemo05 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		//���Ԫ��
		map.put("���޼�", "����");
		map.put("����", "����");
		map.put("���", "С��Ů");
		
		//��ȡ��ֵ�Զ���ļ���
		Set<Map.Entry<String,String>> entrySet = map.entrySet();
		for(Map.Entry<String, String> me:entrySet) {
			String key = me.getKey();
			String value = me.getValue();
			System.out.println(key+","+value);
		}
	}
}

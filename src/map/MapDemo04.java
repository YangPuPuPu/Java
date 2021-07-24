package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 	Map���ϵı���(��ʽ1)��
 * 		1.��ȡ���м��ļ��ϣ���keySet����ʵ��
 * 		2.�������ļ��ϣ���ȡ��ÿһ����������ǿforʵ��
 * 		3.���ݼ�ȥ��ֵ����get(Object key)����ʵ��
 */
public class MapDemo04 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		//���Ԫ��
		map.put("���޼�", "����");
		map.put("����", "����");
		map.put("���", "С��Ů");
		
		//��ȡ���м��ļ��ϣ���keySet����ʵ��
		Set<String> keySet = map.keySet();
		//�������ļ��ϣ���ȡ��ÿһ����������ǿforʵ��
		for(String key:keySet) {
			String value = map.get(key);
			System.out.println(key+","+value);
		}
	}	
}

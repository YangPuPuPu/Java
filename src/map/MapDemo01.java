package map;

import java.util.HashMap;
import java.util.Map;

/*
 * 	Map���ϸ�����
 * 		Interface Map<K,V>  K:�������ͣ�V��ֵ�����͡�
 * 		����ӳ�䵽ֵ�Ķ��󣬲��ܰ����ظ��ļ���ÿ��������ӳ�䵽���һ��ֵ
 * 		������ѧ����ѧ�ź�����
 * 				2019117026 ���
 * 
 * 	����Map���ϵĶ���
 * 		��̬�ķ�ʽ
 * 		�����ʵ����HashMap
 */ 
public class MapDemo01 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		
		//V put (K key,V value)��ָ����ֵ���ӳ���е�ָ���������
		map.put("2019117026", "���");
		map.put("2019117258", "����");
		map.put("2019114123", "����");
		map.put("2019117026", "��С�");//��key��ֵһ����θ�ֵ���Ǹ���֮ǰ��ֵ
		//���
		System.out.println(map);
		
	}
}

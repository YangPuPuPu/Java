package map;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 * ����
 * 		����¼��һ���ַ�����Ҫ��ͳ���ַ�����ÿ���ַ������ֵĴ���(TreeMap˳�����)
 *
 */
public class HashMapDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("��������Ҫ������ַ�����");
		String s = sc.nextLine();
		
//		HashMap<Character, Integer> hm = new HashMap<>();
		TreeMap<Character, Integer> hm = new TreeMap<>();
		
		for(int i = 0;i<s.length();i++) {
			if(hm.get(s.charAt(i))==null) {
				hm.put(s.charAt(i), 1);
			}
			else {
				int value = hm.get(s.charAt(i));
				value++;
				hm.put(s.charAt(i),value);
			}
		}
		
		StringBuilder sb = new  StringBuilder();
		Set<Character> keyset = hm.keySet();
		for(char key:keyset) {
			sb.append(key).append("(").append(hm.get(key)).append(")");
		}
		
		String result = sb.toString();
		
		System.out.println(result);
	}
}

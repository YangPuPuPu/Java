package map;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 * 需求：
 * 		键盘录入一个字符串，要求统计字符串中每个字符串出现的次数(TreeMap顺序输出)
 *
 */
public class HashMapDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("请输入你要输入的字符串：");
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

package set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
 * 不重复的随机数
 */
public class SetText {
	public static void main(String[] args) {
//		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> set = new TreeSet<Integer>();
		Random r = new Random();
		while(set.size()<10) {
			int number = r.nextInt(20)+1;
			set.add(number);
		}
	for(Integer i:set) {
		System.out.println(i);
	}
	}
}

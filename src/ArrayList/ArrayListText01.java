package ArrayList;

import java.util.ArrayList;

/*
 * 集合存储字符串，并遍历
 */
public class ArrayListText01 {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		array.add("小杨");
		array.add("爱学");
		array.add("java");
		for(int i=0;i<array.size();i++) {
			String s = array.get(i);
			System.out.println(s);
		}
	}
}

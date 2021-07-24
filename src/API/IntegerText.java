package API;

import java.util.Arrays;

/*
 *  需求：
 *   有一个字符串，“91 27 46 38 50”，请写程序实现最终输出结果是：“27 38 46 50 91”
 *   
 */
public class IntegerText {
	public static void main(String[] args) {
		//定义一个字符串
		String s = "91 27 46 38 50";
		
		//把字符串中的数字数据存储到一个int类型的数组中
		//得到字符串中每一个数字数据
		//public String[] split(String regex)
		//定义一个int数组，把String[]数组中的每一个元素存储到int数组中
		//public static int parseInt(String s)
		String[] st = s.split(" ");
		int[] arr = new int[st.length];
		for(int i=0;i<st.length;i++) {
			arr[i] = Integer.parseInt(st[i]);
		}
		//排序
		Arrays.sort(arr);
		StringBuilder sb =new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1)
				sb.append(arr[i]);
			else
				sb.append(arr[i]).append(" ");
		}
		String s2=sb.toString();
		System.out.println(s2);
	}
}

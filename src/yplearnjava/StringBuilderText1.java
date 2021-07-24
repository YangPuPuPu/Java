package yplearnjava;

public class StringBuilderText1 {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		String s= arrayToString(arr);
		System.out.println(s);
	}
	/*
	 * 定义一个方法，用于把int数组中数据按照指定格式拼接称为一个字符串返回
	 */
	public static String arrayToString(int[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append('{');
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {
				sb.append(arr[i]);
			}else {
				sb.append(arr[i]).append(", ");
			}
		}
		sb.append('}');
		String s = sb.toString();
		return s;
	}
}

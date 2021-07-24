package yplearnjava;

public class StringText1 {
	public static void main(String[] args) {
		int arr[]= {1,2,3};
		String s = arrayToString(arr);
		System.out.println(s);
	}
	/*
	 * 定义一个方法，用于把int数组中的数据按照指定格式拼接成一个字符串返回
	 */
	public static String arrayToString(int[] arr) {
		String s="";
		s+="[";
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) s+=arr[i];
			else {
				s+=arr[i];
				s+=", ";
			}
		}
		s+="]";
		return s;
	}
}

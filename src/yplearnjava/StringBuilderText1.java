package yplearnjava;

public class StringBuilderText1 {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		String s= arrayToString(arr);
		System.out.println(s);
	}
	/*
	 * ����һ�����������ڰ�int���������ݰ���ָ����ʽƴ�ӳ�Ϊһ���ַ�������
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

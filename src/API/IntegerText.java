package API;

import java.util.Arrays;

/*
 *  ����
 *   ��һ���ַ�������91 27 46 38 50������д����ʵ�������������ǣ���27 38 46 50 91��
 *   
 */
public class IntegerText {
	public static void main(String[] args) {
		//����һ���ַ���
		String s = "91 27 46 38 50";
		
		//���ַ����е��������ݴ洢��һ��int���͵�������
		//�õ��ַ�����ÿһ����������
		//public String[] split(String regex)
		//����һ��int���飬��String[]�����е�ÿһ��Ԫ�ش洢��int������
		//public static int parseInt(String s)
		String[] st = s.split(" ");
		int[] arr = new int[st.length];
		for(int i=0;i<st.length;i++) {
			arr[i] = Integer.parseInt(st[i]);
		}
		//����
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

package yplearnjava;

import java.util.Scanner;

public class StringText2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	String sss = reverse(s);
	System.out.println(sss);
	}
	/*
	 * ����һ��������ʵ���ַ����ķ�ת��
	 */
	public static String reverse(String s) {
		String ss="";
		for(int i=s.length()-1;i>=0;i--) {
			ss+=s.charAt(i);
		}
		return ss;
	}
}

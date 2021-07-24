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
	 * 定义一个方法，实现字符串的反转。
	 */
	public static String reverse(String s) {
		String ss="";
		for(int i=s.length()-1;i>=0;i--) {
			ss+=s.charAt(i);
		}
		return ss;
	}
}

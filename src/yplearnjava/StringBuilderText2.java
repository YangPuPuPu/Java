package yplearnjava;

import java.util.Scanner;

public class StringBuilderText2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(myReverse(s));
	}
	/*
	 * 定义一个方法实现字符串反转
	 */
	public static String myReverse(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String ss = sb.toString();
		return ss;
		//return new StringBuilder(s).reverse.toString;
	}
}

package yplearnjava;
import java.util.Scanner;
public class printString {
	public static void main(String[] arcs) {
		//创建对象
		Scanner sc=new Scanner(System.in);
		//接受字符串
		String s1=sc.nextLine();
		//取得字符串长度：public int length();
		System.out.println(s1.length());
		for(int i=0;i<s1.length();i++) {
			//public char charAt(int index); 返回指定索引处的char值，字符串索引也是从0开始的。
			System.out.println(s1.charAt(i));
		}
	}
}

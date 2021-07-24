package yplearnjava;

/*
 * StringBuilder 转化为String
 * 		public String toString(); 通过toString()就可以实现吧StringBuilder转化为String；
 * 
 * String 转化为 StringBuilder
 * 		public StringBuilder(String s); 通过构造方法就可以实现把String转换为StringBuilder;
 */
public class StringBuilderDemo02 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		String s = sb.toString();
		System.out.println("s:"+s);
		StringBuilder sb1 = new StringBuilder(s);
		System.out.println("sb1:"+sb1);
	}
}

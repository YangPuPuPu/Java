package yplearnjava;

/*
 * StringBuilder 的添加和反转方法
 * 		public StringBuilder append(任意类型）;添加数据，并返回对象本身；
 * 		public StringBuilder reverse(); 返回相反的字符数列;
 */
public class StringBuilderDemo01 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("abc");
		sb.append("hello");
		sb.append(123);
		System.out.println("sb:"+sb);
		//链式编程
		//sb.append("abc").append("hello").append(123);
		sb.reverse();
		System.out.println("sb:"+sb);
	}
}

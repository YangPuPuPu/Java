package yplearnjava;

/*
 * StringBuilder ת��ΪString
 * 		public String toString(); ͨ��toString()�Ϳ���ʵ�ְ�StringBuilderת��ΪString��
 * 
 * String ת��Ϊ StringBuilder
 * 		public StringBuilder(String s); ͨ�����췽���Ϳ���ʵ�ְ�Stringת��ΪStringBuilder;
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

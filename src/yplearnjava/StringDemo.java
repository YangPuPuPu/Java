package yplearnjava;
import java.util.Scanner;
//public String nextLine();���ڻ�ȡ����¼�����ݡ�
public class StringDemo {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//�����ַ���
	String s=sc.nextLine();
	System.out.println(s);
	//public String(); ����һ���հ��ַ���
	String s1=new String();
	System.out.println("s1:"+s1);
	//public String(char[] chs); �����ַ���������ݣ������ַ�������
	char chs []=new char[] {
			'a','b','c'
	};
	String s2=new String(chs);
	System.out.println("s2"+s2);
	//public String(byte[] bys);    ****�ֽ�����Ҳ����acssl��ʲô������������acssl
	//String s= "abc"
	String s3="abc";
	System.out.println(s3);
	//�Ƚ��ַ��������ַ�Ƿ���ͬ
	System.out.println(s1==s2);
	//�����ַ������ݱȽϵķ���public boolean equals(Object anObject);
	System.out.println(s1.equals(s2));
	System.out.println(s3.equals(s2));
	}
	/*
	 * String ������ص㣺1.ͨ��new�������ַ�������ÿ��new��������һ���µĶ��ڴ棬��Ȼ������ͬ�����ǵ�ַ��ͬ��
	 * �á�����ʽ�������ַ�����ֻҪ�����ַ�������ͬ�������ڴ�����ֶ��ٴΣ�ֻ�ᴴ��һ��String����
	 * Ҳ����˵��s3=��abc���� s4=��abc���������ĵ�ַ����ͬ��
	 * 
	 * ����==��ʹ�ã�1.�ڻ��������������ǱȽ�����ֵ�Ƿ���ȣ�
	 * 				2.�������������ǱȽϵ�ֵַ�Ƿ���ȣ�
	 */
}

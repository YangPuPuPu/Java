package yplearnjava;
import java.util.Scanner;
//public String nextLine();用于获取键盘录入数据。
public class StringDemo {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//输入字符串
	String s=sc.nextLine();
	System.out.println(s);
	//public String(); 构建一个空白字符串
	String s1=new String();
	System.out.println("s1:"+s1);
	//public String(char[] chs); 根据字符数组的内容，创建字符串对象；
	char chs []=new char[] {
			'a','b','c'
	};
	String s2=new String(chs);
	System.out.println("s2"+s2);
	//public String(byte[] bys);    ****字节数组也就是acssl码什么的数组内容是acssl
	//String s= "abc"
	String s3="abc";
	System.out.println(s3);
	//比较字符串对象地址是否相同
	System.out.println(s1==s2);
	//进行字符串内容比较的方法public boolean equals(Object anObject);
	System.out.println(s1.equals(s2));
	System.out.println(s3.equals(s2));
	}
	/*
	 * String 对象的特点：1.通过new创建的字符串对象，每次new都会申请一个新的堆内存，虽然内容相同，但是地址不同。
	 * 用“”方式给出的字符串，只要给出字符序列相同，无论在代码出现多少次，只会创建一个String对象
	 * 也就是说：s3=“abc”； s4=“abc”；他俩的地址是相同的
	 * 
	 * 关于==的使用：1.在基本数据类型中是比较数据值是否相等；
	 * 				2.在引用类型中是比较地址值是否相等；
	 */
}

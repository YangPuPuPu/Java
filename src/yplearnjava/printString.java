package yplearnjava;
import java.util.Scanner;
public class printString {
	public static void main(String[] arcs) {
		//��������
		Scanner sc=new Scanner(System.in);
		//�����ַ���
		String s1=sc.nextLine();
		//ȡ���ַ������ȣ�public int length();
		System.out.println(s1.length());
		for(int i=0;i<s1.length();i++) {
			//public char charAt(int index); ����ָ����������charֵ���ַ�������Ҳ�Ǵ�0��ʼ�ġ�
			System.out.println(s1.charAt(i));
		}
	}
}

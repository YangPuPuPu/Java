import java.util.Scanner;
import java.util.Random;
public class ���� {  
	public static void main(String[] argc) {
		Scanner sc= new Scanner(System.in);
		Random r=new Random();
		int a=sc.nextInt();
		int b=r.nextInt(100);
		System.out.println(demo(a,b));
		int arr[]= {1,2,2};
		fun(arr);
		System.out.println(arr[1]);
	}
	/*
	 �������أ�
	 	���������ͬһ�����У�
	 	�������������ͬ�ķ�������
	 	��������Ĳ�������ͬ�����Ͳ�ͬ����������ͬ��
	 */
	public static int demo(int a,int b) {
		return a+b;
	}
	public static double demo(double a,double b) {
		return a+b;
	}
	public static int demo(int a,int b,int c) {
		return a+b+c;
	}
	//�����������͵Ĳ�������ʽ�����ĸı䣬Ӱ��ʵ�ʲ�������ֵ��
	
	
	public static void fun(int [] a) {
		a[1]=100;
	}
	
}
	
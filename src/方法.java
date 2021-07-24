import java.util.Scanner;
import java.util.Random;
public class 方法 {  
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
	 方法重载：
	 	多个方法在同一个类中；
	 	多个方法具有相同的方法名；
	 	多个方法的参数不相同（类型不同或者数量不同）
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
	//对于引用类型的参数，形式参数的改变，影响实际参数的数值。
	
	
	public static void fun(int [] a) {
		a[1]=100;
	}
	
}
	
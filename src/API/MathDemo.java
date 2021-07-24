package API;
/*
 * Math类的常用方法
 */
public class MathDemo {
	public static void main(String[] args) {
		// public static int abs(int a)//返回参数的绝对值
		System.out.println(Math.abs(88));
		System.out.println(Math.abs(-88));
		// public static double ceil(double a)//返回大于或者等于参数的最小double值，等于一个整数
		System.out.println(Math.ceil(8.8));
		System.out.println(Math.ceil(-8.8));
		// public static double floor(double a)//返回小于或者等于参数的最大double值，等于一个整数
		System.out.println(Math.floor(8.8));
		System.out.println(Math.floor(-8.8));
		// public static int round(float a)//按照四舍五入返回最接近参数的int
		System.out.println(Math.round(8.8));
		System.out.println(Math.round(-8.8));
		// public static int max(int a,int b)//返回两个int值中的较大值
		System.out.println(Math.max(8, 10));
		// public static int min(int a,int b)//返回两个int值中的较小值
		System.out.println(Math.min(8, 10));
		// public static double pow(double a,double b)//返回a的b次幂的值
		System.out.println(Math.pow(2, 3));
		// public static double random()//返回为double的正值，[0.0,1.0]
		System.out.println(Math.random());

	}
}

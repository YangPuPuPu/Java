package API;
/*
 * Math��ĳ��÷���
 */
public class MathDemo {
	public static void main(String[] args) {
		// public static int abs(int a)//���ز����ľ���ֵ
		System.out.println(Math.abs(88));
		System.out.println(Math.abs(-88));
		// public static double ceil(double a)//���ش��ڻ��ߵ��ڲ�������Сdoubleֵ������һ������
		System.out.println(Math.ceil(8.8));
		System.out.println(Math.ceil(-8.8));
		// public static double floor(double a)//����С�ڻ��ߵ��ڲ��������doubleֵ������һ������
		System.out.println(Math.floor(8.8));
		System.out.println(Math.floor(-8.8));
		// public static int round(float a)//�����������뷵����ӽ�������int
		System.out.println(Math.round(8.8));
		System.out.println(Math.round(-8.8));
		// public static int max(int a,int b)//��������intֵ�еĽϴ�ֵ
		System.out.println(Math.max(8, 10));
		// public static int min(int a,int b)//��������intֵ�еĽ�Сֵ
		System.out.println(Math.min(8, 10));
		// public static double pow(double a,double b)//����a��b���ݵ�ֵ
		System.out.println(Math.pow(2, 3));
		// public static double random()//����Ϊdouble����ֵ��[0.0,1.0]
		System.out.println(Math.random());

	}
}

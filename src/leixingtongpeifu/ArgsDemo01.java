package leixingtongpeifu;
/*
 * �ɱ����
 */
public class ArgsDemo01 {
	public static void main(String[] args) {
		System.out.println(sum(10,20));
		System.out.println(sum(10,20,30));
		System.out.println(sum(10,20,30,40));
		System.out.println(sum(10,20,30,40,50));
		System.out.println(sum(10,20,30,40,50,60));
		
		
	}
	
//	public static int sum(int b,int...a) {//�����ʾ��һ���β�Ϊb���඼Ϊa
//		return 0;
//	}
	public static int sum(int... a) {//�����a��ʵ��һ������
		int sum =0;
		for(int i :a) {
			sum+=i;
		}
		return sum;
	}
}

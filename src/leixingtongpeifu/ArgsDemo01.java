package leixingtongpeifu;
/*
 * 可变参数
 */
public class ArgsDemo01 {
	public static void main(String[] args) {
		System.out.println(sum(10,20));
		System.out.println(sum(10,20,30));
		System.out.println(sum(10,20,30,40));
		System.out.println(sum(10,20,30,40,50));
		System.out.println(sum(10,20,30,40,50,60));
		
		
	}
	
//	public static int sum(int b,int...a) {//这里表示第一个形参为b其余都为a
//		return 0;
//	}
	public static int sum(int... a) {//这里的a其实是一个数组
		int sum =0;
		for(int i :a) {
			sum+=i;
		}
		return sum;
	}
}

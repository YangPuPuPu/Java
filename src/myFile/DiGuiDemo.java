package myFile;
/*
 * 用递归实现斐波那契数列:1,1,2,3,5,8,13,21
 */
public class DiGuiDemo {
	public static void main(String[] args) {
		System.out.println(f(20));
	}

/*
 * 递归实现一个方法
 * f(n)表示第n个数
 * f(n-1)表示第n-1个数
 * f(n-2)表示第n-2个数
 * 
 * StackOverflowError:当堆栈溢出发生时抛出一个应用程序递归太深。(没有出口) 
 */
public static int f(int n) {
	if(n==1||n==2)
		return 1;
	return f(n-1)+f(n-2);
	}
}
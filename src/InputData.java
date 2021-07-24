//数据输入
//导包:导包这个动作必须在类定义的上面
import java.util.Scanner;
public class InputData {

	public static void main(String[] args) {
		//创建对象 下面这个式子只有sc是变量名可以变，其余都不允许变。
		Scanner sc =new Scanner(System.in);
		//接受数据 下面这个表达式 只有sc是变量名可以变，其余都不允许变。
		System.out.println("请输入a的值：");
		int a=sc.nextInt();
		System.out.println("请输入b的值：");
		int b=sc.nextInt();
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		//如果想在一个输出语句中输出多个对象，就需要在多个对象中间加上字符串常量。
		System.out.println("a:"+a+"b:"+b);
		System.out.println(a+""+b);
		System.out.println(a+b);
		/****************
		 System.out.println(内容);输出内容并换行。
		 System.out.print(内容);输出内容不换行。
		 System.out.print（）;换行符。
		 */
	}

}

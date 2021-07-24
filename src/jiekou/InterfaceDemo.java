package jiekou;

public class InterfaceDemo {
	public static void main(String[] args) {
		Inter i = new InterImpl();
//		i.num//这个变量默认被final修饰，要看成常量
		System.out.println(i.num);
//		i.num2=40;
		System.out.println(i.num2);
		System.out.println(Inter.num);//可以直接使用接口名来访问接口里面的成员变量
	}
}

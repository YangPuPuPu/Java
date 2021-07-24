package jicheng;
/*
 * 测试类
 */

public class Demo {
	public static void main(String[] args) {
		//创建方法,调用方法
		Zi z=new Zi();
		Zi z0= new Zi(20);
		z.show();
		//
		//调用成员方法也是就近原则，先在子类中查找方法，如果子类中没有再到父类中查找。
		z.method();
		new Zi().method();
		
	}
}

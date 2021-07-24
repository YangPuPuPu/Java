package neibulei;
/*
 * 测试类
 */
public class OuterDemo {
	public static void main(String[] args) {
		//创建内部类对象，并调用方法
//		Inner i = new Inner();//这是错误的
//		Outer.Inner oi = new Outer().new Inner();
//		oi.show();
		
		Outer o= new Outer();
		o.method();
		
	}
}

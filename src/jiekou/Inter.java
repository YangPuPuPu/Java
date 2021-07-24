package jiekou;
/*
 * 接口的成员特点：
 * 		成员变量：只能是常量，默认修饰符public static final
 * 		构造方法：接口没有构造方法，接口主要对行为进行抽象，没有具体存在
 * 		一个类如果没有父类，默认继承自Object类
 * 		成员方法：
 * 			只能是抽象方法
 * 			默认修饰符：public abstract
 */
public interface Inter {
	public int num =10;
	public final int num2 = 20;
//	public static final int num3 = 20;()
	int num3=20;//这里是默认为上面定义的

	//接口是没有构造方法和实体方法的。
//	public Inter() {}
	
//	public void show{}
	public abstract void method();
//	void show();这里也是默认为上面的public abstract
}

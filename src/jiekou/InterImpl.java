package jiekou;

//public class InterImpl implements Inter {//每一个类都继承一个父类Object--这个类只包含一个无参构造方法
public class InterImpl extends Object implements Inter{
	public InterImpl() {
		super();
	}
	public void method() {
		// TODO 自动生成的方法存根
		System.out.println("methond");
	}
}

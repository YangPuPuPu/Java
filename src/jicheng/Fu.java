package jicheng;

public class Fu {
	public int age=40;
	
	public Fu() {
		System.out.println("父中无参构造方法被调用");
	}
	
	public Fu(int age) {
		System.out.println("父中带参构造方法被调用");
	}
	
	public void method() {
		System.out.println("父中method方法被调用");
	}
}

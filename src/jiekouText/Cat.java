package jiekouText;

public class Cat extends Animal implements Jumpping{
	@Override
	public void eat() {
		// TODO 自动生成的方法存根
		System.out.println("猫吃鱼");	
	}
	
	@Override
	public void jump() {
		// TODO 自动生成的方法存根
		System.out.println("猫也可以跳高");
	}
	public Cat() {}
	public Cat(String name,int age) {
		super(name,age);
	}
}

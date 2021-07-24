package jiekouText2;

public class BasketballPlayer extends Player {
	public BasketballPlayer() {
		
	}
	public BasketballPlayer(String name,int age) {
		super(name,age);
	}
	@Override
	public void study() {
		// TODO 自动生成的方法存根
		System.out.println("篮球运动员学习运球和投篮");
	}
	@Override
	public void eat() {
		// TODO 自动生成的方法存根
		System.out.println("篮球运动员吃牛肉，喝牛奶");
	}
	
}

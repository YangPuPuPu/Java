package chouxiang;
/*
 * 抽象类（抽象类和抽象方法都得用abstract修饰符来修饰）
 * 		并且创建抽象对象会报错
 * 		抽象类中可以没有抽象方法，但是有抽象方法不可以没有抽象类
 */
public abstract class Animal {
	private int age = 40;
	private final String city = "襄阳";
	
	public Animal() {}//虽然不能实例化，但是可以参照多态，使用子类对象进行构造
	public Animal(int age){
		this.age=age;
	}
	//抽象方法
	public abstract void eat();
	
	public void sleep(){
		System.out.println("睡觉");
	}
	public void show() {
		age=20;
		System.out.println(age);
//		city="武汉";//不能对final修饰的常量进行赋值
		System.out.println(city);
	}
}

package chouxiang;
	/*
	 * 抽象类的特点：1.抽象类必须用abstract关键字修饰
	 * 		public abstract class 类名{}
	 * 		public abstract void eat();
	 * 				2.抽象类不一定有抽象方法，有抽象方法一定是抽象类
	 * 				3.抽象类不能实例化
	 * 					可以参照多态的方式，通过子类对象实例化。这叫抽象多态类
	 * 				4.抽象类的子类
	 * 					要么重写抽象类的所有抽象方法
	 * 					要么是抽象类
	 */
public class AnimalDemo {
	public static void main(String[] args) {
		//		Animal a = new Animal();
		Animal a = new Cat();
		a.eat();//这里cat进行了方法重写
		a.sleep();//这里是cat继承了animal的方法
		a.show();
	}	
}

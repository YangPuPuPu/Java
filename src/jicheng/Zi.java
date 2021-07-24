package jicheng;

public class Zi extends Fu {
	// 身高
	public int height = 175;

	// 年龄
	public int age = 20;

	// 在子类初始化之前一定要先完成父类的初始化，因为在调用子类时可能会用到父类的数据

	public Zi() {
		// 在子类构造方法中默认第一句是super();即默认第一句是父类的无参构造方法被调用
		// super();
		System.out.println("子中无参构造方法被调用");
	}

	public Zi(int age) {
		// 在父类没有无参构造方法时，你可以在子类中使用super关键字去调用父类中的带参构造方法
		// 也可以在父类中自己构造一个无参构造方法
		super(20);
		System.out.println("子中带参构造方法被调用");
	}

	public void show() {
		int age = 30;
		// 在这里age先在局部范围找，再在子类成员变量找，最后在父类成员变量找
		System.out.println(age);
		// 如果要访问本类中的成员变量age要用this关键字
		System.out.println(this.age);
		// 如果要访问父类中的成员变量age要用super关键字
		System.out.println(super.age);
		System.out.println(height);
	}

	public void method() {
//		super.method();
		System.out.println("子中method方法被调用");
	}
}

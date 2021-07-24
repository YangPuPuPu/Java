package duotai;
/*
 *   多态：
 *   	同一个对象，在不同时刻表现出来的不同形态
 *   
 *   举例：猫
 *   	我们可以说猫是猫，猫 cat = new 猫();
 *   	我们也可以说猫是动物 动物 animal = new 猫();
 *   这里猫在不同的时刻表现出来了不同的形态，这就是多态
 *   
 *   多态的前提和体现
 *   	有继承/实现关系
 *   	有方法重写
 *   	有父类引用指向子类对象;
 *   
 */
public class AnimalDemo {
	public static void main(String[] args) {
		//有父类引用指向子类对象
		Animal a = new Cat();
		
		//使用多态的形式访问成员变量看左边
		//即左边有的成员变量才可以访问
		//访问的是左边的成员变量
		System.out.println(a.age);
//		System.out.println(a.weight);//这个不在Animal类中有不能访问
		
		//使用多态的形式访问成员方法看右边
		//即左边有的成员方法才可以访问
		//但是访问的是右边的成员方法
		a.eat();
//		a.playGames();
		
		/*
		 * 多态的好处：提高了程序的扩展性
		 * 		具体体现：定义方法时，使用父类型作为参数，将来在使用的时候，使用具体的子类型进行操作
		 * 多态的弊端：不能使用子类的特有功能
		 */
		AnimalOperator ao = new AnimalOperator();
		Cat c1= new Cat();
		Dog d = new Dog();
		ao.useAnimal(c1);
		ao.useAnimal(d);
		
	}
}

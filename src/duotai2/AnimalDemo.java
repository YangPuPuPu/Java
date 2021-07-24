package duotai2;
/*
 * 	向上转型
 * 		从父到子
 * 		父亲引用指向对象
 * 
 *  向下转型(解决了多态的弊端——不能访问子类独有的功能）
 *  	从父到子
 *  	父亲引用转为子类对象
 */
public class AnimalDemo {
	public static void main(String[] args) {
		//多态
		Animal a= new Cat();//向上转型
		a.eat();
//		a.play;
		
		//向下转型
		Cat c = (Cat)a;
		c.eat();
		c.play();
		
		//多态
		a=new Dog();//向上转型
		a.eat();
		
		//向下转型
		//ClassCastException:类型转换异常
//		Cat cc=(Cat)a;
//		cc.eat();
//		cc.play();
		
	}
}

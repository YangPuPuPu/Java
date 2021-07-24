package duotai;
/*
 * 动物操作类
 */
public class AnimalOperator {
	
	
//	public void useAnimal(Cat c) {
//		c.eat();
//	}
//	public void useAnimal(Dog d) {
//		d.eat();
//	}
	public void useAnimal(Animal a) {
		//Animal a = new Cat();
		//Animal a = new Dog();
		a.eat();
		
		//这是狗特有的，访问不到
//		a.lookdoor;
	}
}

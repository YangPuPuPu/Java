package jiekouText;
/*
 * 测试类
 */
public class AnimalDemo {
	public static void main(String[] args) {
		Jumpping j=new Cat();
		j.jump();
		System.out.println("-----------");
		
		Animal a=new Cat();
		a.setName("加菲");
		a.setAge(20);
		System.out.println(a.getName()+","+a.getAge());
		a.eat();
		System.out.println("------------");
		
		Animal aa=new Cat("加菲",20);
		System.out.println(a.getName()+","+a.getAge());
		a.eat();
		System.out.println("------------");
		
		Cat c=new Cat();
		c.setName("加菲");
		c.setAge(20);
		System.out.println(c.getName()+","+c.getAge());
		c.eat();
		c.jump();
	}
}

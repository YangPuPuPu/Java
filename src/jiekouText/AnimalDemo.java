package jiekouText;
/*
 * ������
 */
public class AnimalDemo {
	public static void main(String[] args) {
		Jumpping j=new Cat();
		j.jump();
		System.out.println("-----------");
		
		Animal a=new Cat();
		a.setName("�ӷ�");
		a.setAge(20);
		System.out.println(a.getName()+","+a.getAge());
		a.eat();
		System.out.println("------------");
		
		Animal aa=new Cat("�ӷ�",20);
		System.out.println(a.getName()+","+a.getAge());
		a.eat();
		System.out.println("------------");
		
		Cat c=new Cat();
		c.setName("�ӷ�");
		c.setAge(20);
		System.out.println(c.getName()+","+c.getAge());
		c.eat();
		c.jump();
	}
}

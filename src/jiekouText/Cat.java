package jiekouText;

public class Cat extends Animal implements Jumpping{
	@Override
	public void eat() {
		// TODO �Զ����ɵķ������
		System.out.println("è����");	
	}
	
	@Override
	public void jump() {
		// TODO �Զ����ɵķ������
		System.out.println("èҲ��������");
	}
	public Cat() {}
	public Cat(String name,int age) {
		super(name,age);
	}
}

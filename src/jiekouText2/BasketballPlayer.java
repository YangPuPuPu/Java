package jiekouText2;

public class BasketballPlayer extends Player {
	public BasketballPlayer() {
		
	}
	public BasketballPlayer(String name,int age) {
		super(name,age);
	}
	@Override
	public void study() {
		// TODO �Զ����ɵķ������
		System.out.println("�����˶�Աѧϰ�����Ͷ��");
	}
	@Override
	public void eat() {
		// TODO �Զ����ɵķ������
		System.out.println("�����˶�Ա��ţ�⣬��ţ��");
	}
	
}

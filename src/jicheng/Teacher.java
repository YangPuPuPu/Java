package jicheng;

public class Teacher extends People{
	public Teacher() {
		
	}
	public Teacher(String name,int age) {
		//this.age=age;
		//this.name=name
		//�ⶼ�Ǵ����age��name���з�װ
		super(name,age);//ʹ�õ��ø���Ĵ��ι��췽��
	}
	
	public void teach() {
		System.out.println("��������");
	}
}

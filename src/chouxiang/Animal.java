package chouxiang;
/*
 * �����ࣨ������ͳ��󷽷�������abstract���η������Σ�
 * 		���Ҵ����������ᱨ��
 * 		�������п���û�г��󷽷��������г��󷽷�������û�г�����
 */
public abstract class Animal {
	private int age = 40;
	private final String city = "����";
	
	public Animal() {}//��Ȼ����ʵ���������ǿ��Բ��ն�̬��ʹ�����������й���
	public Animal(int age){
		this.age=age;
	}
	//���󷽷�
	public abstract void eat();
	
	public void sleep(){
		System.out.println("˯��");
	}
	public void show() {
		age=20;
		System.out.println(age);
//		city="�人";//���ܶ�final���εĳ������и�ֵ
		System.out.println(city);
	}
}

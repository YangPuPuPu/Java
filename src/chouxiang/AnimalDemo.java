package chouxiang;
	/*
	 * ��������ص㣺1.�����������abstract�ؼ�������
	 * 		public abstract class ����{}
	 * 		public abstract void eat();
	 * 				2.�����಻һ���г��󷽷����г��󷽷�һ���ǳ�����
	 * 				3.�����಻��ʵ����
	 * 					���Բ��ն�̬�ķ�ʽ��ͨ���������ʵ��������г����̬��
	 * 				4.�����������
	 * 					Ҫô��д����������г��󷽷�
	 * 					Ҫô�ǳ�����
	 */
public class AnimalDemo {
	public static void main(String[] args) {
		//		Animal a = new Animal();
		Animal a = new Cat();
		a.eat();//����cat�����˷�����д
		a.sleep();//������cat�̳���animal�ķ���
		a.show();
	}	
}

package jiekou;

public class InterfaceDemo {
	public static void main(String[] args) {
		Inter i = new InterImpl();
//		i.num//�������Ĭ�ϱ�final���Σ�Ҫ���ɳ���
		System.out.println(i.num);
//		i.num2=40;
		System.out.println(i.num2);
		System.out.println(Inter.num);//����ֱ��ʹ�ýӿ��������ʽӿ�����ĳ�Ա����
	}
}

package yplearnjava;

/*
 * ��������
 * 		��ʽ�� ���� ������ = new ����();
 * 		������ Phone p = new Phone();
 * 		
 * ʹ�ö���
 * 		1��ʹ�ó�Ա����
 * 			��ʽ��������.������
 * 			������p.brand
 * 		2.ʹ�ó�Ա����
 *			��ʽ��������.��Ա��
 *			������p.call()
 */
public class PhoneDemo {
	public static void main(String[] args) {
		// ��������
		Phone p = new Phone();
		// ʹ�ó�Ա����
		System.out.println(p.brand);//null
		System.out.println(p.price);//0
		p.brand = "��Ϊ";
		p.price = 2999;
		System.out.println(p.brand);
		System.out.println(p.price);
		// ʹ�ó�Ա����
		p.call();
		p.sendMessage();
	}
}

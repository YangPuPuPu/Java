package jicheng;
/*
 * ������
 */

public class Demo {
	public static void main(String[] args) {
		//��������,���÷���
		Zi z=new Zi();
		Zi z0= new Zi(20);
		z.show();
		//
		//���ó�Ա����Ҳ�Ǿͽ�ԭ�����������в��ҷ��������������û���ٵ������в��ҡ�
		z.method();
		new Zi().method();
		
	}
}

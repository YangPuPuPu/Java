package neibulei;
/*
 *   �ڲ����ʽ��
 *   	public class ����{
 *   		���η� class ����{
 *   	}
 *   }
 *   
 *   �ڲ�������ص㣺
 *   	�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա������˽��
 *   	�ⲿ��Ҫ�����ڲ���ĳ�Ա�����봴������
 */
public class Outer {
	private int num = 10;
	
	/*public class Inner{
		public void show() {
			System.out.println(num);
		}
	}*/
	
	private class Inner{//һ����˵�ڲ�������η�����private//��Ա�ڲ���
		public void show() {
			System.out.println(num);
		}
	}
	public void method() {
	Inner i = new Inner();
	i.show();
	}
}

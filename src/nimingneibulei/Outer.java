package nimingneibulei;
/*
 *  ǰ�᣺
 *  	����һ������߽ӿ�
 *  	�����������Ǿ�����Ҳ�����ǳ�����
 *  
 *  ��ʽ��
 *  	new�������߽ӿ�������{
 *  		��д����
 *  };
 *  
 *  ����:
 *  	����һ���̳��˸�����߸ýӿڵ� ���� ��������
 */
public class Outer {
	public void method() {
		/*
		new Inner() { //�����൱���½���һ�������������ʵ����Inner�ӿ�
			@Override
			public void show() {
				// TODO �Զ����ɵķ������
				System.out.println("�����ڲ���");
			}
		};
		*/
		//������Ҫ����Inner�����show������ʹ��
		new Inner() { //�����൱���½���һ�������������ʵ����Inner�ӿ�
			@Override
			public void show() {
				// TODO �Զ����ɵķ������
				System.out.println("�����ڲ���");
			}
		}.show();//�������Inner�������show����
		
		//����Ҫ���ʹ��
		Inner i = new Inner() {
			public void show() {
				System.out.println("�����ڲ���");
			};
		};
		i.show();
		i.show();
	}
}

package jicheng;
/*
 * ���ֻ�
 */
public class NewPhone extends Phone{
	
	//��дcall����
	@Override		//����Ǹ�ע�⣬���ڼ����д������������ȷ��
	public void call(String name) {
		System.out.println("������Ƶ����");
//		System.out.println("��"+name+"��绰");
		super.call(name);
	}
	/*
	 * ������дע������
	 * 	1.˽�з������ܱ���д(����˽�г�Ա�����ǲ��ܼ̳е�)���ڸ�������private���εĳ�Ա�����������ǲ��ܷ��ʵ�
	 *  2.���෽������Ȩ�޲��ܸ��ͣ�public>Ĭ��>˽�У�  ������������д����ʱ����Ȩ��Ӧ�ô��ڵ��ڸ��෽��
	 */
}

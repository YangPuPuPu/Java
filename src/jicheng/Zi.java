package jicheng;

public class Zi extends Fu {
	// ���
	public int height = 175;

	// ����
	public int age = 20;

	// �������ʼ��֮ǰһ��Ҫ����ɸ���ĳ�ʼ������Ϊ�ڵ�������ʱ���ܻ��õ����������

	public Zi() {
		// �����๹�췽����Ĭ�ϵ�һ����super();��Ĭ�ϵ�һ���Ǹ�����޲ι��췽��������
		// super();
		System.out.println("�����޲ι��췽��������");
	}

	public Zi(int age) {
		// �ڸ���û���޲ι��췽��ʱ���������������ʹ��super�ؼ���ȥ���ø����еĴ��ι��췽��
		// Ҳ�����ڸ������Լ�����һ���޲ι��췽��
		super(20);
		System.out.println("���д��ι��췽��������");
	}

	public void show() {
		int age = 30;
		// ������age���ھֲ���Χ�ң����������Ա�����ң�����ڸ����Ա������
		System.out.println(age);
		// ���Ҫ���ʱ����еĳ�Ա����ageҪ��this�ؼ���
		System.out.println(this.age);
		// ���Ҫ���ʸ����еĳ�Ա����ageҪ��super�ؼ���
		System.out.println(super.age);
		System.out.println(height);
	}

	public void method() {
//		super.method();
		System.out.println("����method����������");
	}
}

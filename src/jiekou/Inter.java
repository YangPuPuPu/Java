package jiekou;
/*
 * �ӿڵĳ�Ա�ص㣺
 * 		��Ա������ֻ���ǳ�����Ĭ�����η�public static final
 * 		���췽�����ӿ�û�й��췽�����ӿ���Ҫ����Ϊ���г���û�о������
 * 		һ�������û�и��࣬Ĭ�ϼ̳���Object��
 * 		��Ա������
 * 			ֻ���ǳ��󷽷�
 * 			Ĭ�����η���public abstract
 */
public interface Inter {
	public int num =10;
	public final int num2 = 20;
//	public static final int num3 = 20;()
	int num3=20;//������Ĭ��Ϊ���涨���

	//�ӿ���û�й��췽����ʵ�巽���ġ�
//	public Inter() {}
	
//	public void show{}
	public abstract void method();
//	void show();����Ҳ��Ĭ��Ϊ�����public abstract
}

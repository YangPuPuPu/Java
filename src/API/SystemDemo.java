package API;

/*
 * Syetem���õķ���
 */
public class SystemDemo {
	public static void main(String[] args) {
		/*
		 * System.out.println("��ʼ"); //public static void exit(int
		 * status)//��ֹ��ǰ���е�Java������������ʾ�쳣��ֹ System.exit(0); System.err.println("����");
		 */

		// public static long currentTimeMillis();���ص�ǰʱ�䣨�Ժ���Ϊ��λ��
		System.out.println(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "��");
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			System.err.println(i);
		}
		long end = System.currentTimeMillis();
		System.err.println("����ʱ" + (end - start) + "����");
	}
}

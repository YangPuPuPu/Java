package yplearnjava;

/*
 * StringBuilder ����Ӻͷ�ת����
 * 		public StringBuilder append(�������ͣ�;������ݣ������ض�����
 * 		public StringBuilder reverse(); �����෴���ַ�����;
 */
public class StringBuilderDemo01 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("abc");
		sb.append("hello");
		sb.append(123);
		System.out.println("sb:"+sb);
		//��ʽ���
		//sb.append("abc").append("hello").append(123);
		sb.reverse();
		System.out.println("sb:"+sb);
	}
}

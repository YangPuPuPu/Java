package API;
/*
 *  ���췽����
 *  	public Integer(int value);����intֵ����Integer���󣨹�ʱ��
 *  	public Integer(String s);����Stringֵ����Integer���󣨹�ʱ��
 *  
 *  ��̬������ȡ����
 *  	public static Integer valueOf(int i);���ر�ʾָ����intֵ��Integerʵ��
 *  	public static Integer valueOf(String s);����һ������ָ��ֵ��Integer����String
 */
public class IntegerDemo2 {
	public static void main(String[] args) {
		//public Integer(int value);����intֵ����Integer���󣨹�ʱ��
		Integer i = new Integer(100);
		System.out.println(i);
		
		//public Integer(String s);����Stringֵ����Integer���󣨹�ʱ��
		Integer i1 = new Integer("100");
		//Integer i1 = new Integer("abc");//(NumberFormatException.java:68)��ֻ�ܽ��������ַ���
		System.out.println(i1);
		
		//public static Integer valueOf(int i);���ر�ʾָ����intֵ��Integerʵ��
		Integer i2 =Integer.valueOf(100);
		System.out.println(i2);
		
		//public static Integer valueOf(String s);����һ������ָ��ֵ��Integer����String
		Integer i3 =Integer.valueOf("100");
		System.out.println(i3);
	}
}

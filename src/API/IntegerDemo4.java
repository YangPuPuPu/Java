package API;
/*
 *   װ�䣺�ѻ�����������ת��Ϊ��Ӧ�İ�װ������
 *   ���䣺�Ѱ�װ������ת��Ϊ��Ӧ�Ļ�����������
 */
public class IntegerDemo4 {
	public static void main(String[] args) {
		Integer i = Integer.valueOf(100);
		Integer ii =100;
		
		ii= ii.intValue()+200;
		ii+=200;
		System.out.println(ii);
		Integer iii = null;
		if(iii!=null)
			iii+=300;//NullPointerException��ָ��
		
	}
}

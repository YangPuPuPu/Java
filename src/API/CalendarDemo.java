package API;

import java.util.Calendar;

/*
 * 	Calendar Ϊĳһʱ�κ�һ�������ֶ�֮���ת���ṩ��һЩ��������Ϊ���������ֶ��ṩ��һЩ����
 *  
 *  Calendar �ṩ��һ���෽��getInstance���ڻ�ȡCalendar�����������ֶ���ʹ�õ�ǰ���ں�ʱ���ʼ��
 *  	Calendar rightNow = Calendar.gerInstance();
 */

/*
 * 	public abstract void add(int field,int amount);
 * 		���������Ĺ��򣬽�ָ����ʱ������ӻ��߼�ȥ�����������ֶ�
 * 	public final void set(int year,int month,int date);
 * 		���õ�ǰ������������
 */
public class CalendarDemo {
	public static void main(String[] args) {
		//��ȡ����
		Calendar c = Calendar.getInstance();//��̬����ʽ
//		System.out.println(c);
		
		//public int get (int field)
		int year  = c.get(Calendar.YEAR);
		int month = c.get(	Calendar.MONTH)+1;
		int date = c.get(Calendar.DATE);
		System.out.println(year+"��"+month+"��"+date+"��");
		
		//public abstract void add(int field,int amount);
		//����10����5��ǰ
		c.add(Calendar.YEAR,10);
		c.add(Calendar.DATE,-5);
		int year1  = c.get(Calendar.YEAR);
		int month1 = c.get(	Calendar.MONTH)+1;
		int date1 = c.get(Calendar.DATE);
		System.out.println(year1+"��"+month1+"��"+date1+"��");
	
		c.set(2021, 11, 15);
		int year2  = c.get(Calendar.YEAR);
		int month2 = c.get(	Calendar.MONTH)+1;
		int date2 = c.get(Calendar.DATE);
		System.out.println(year2+"��"+month2+"��"+date2+"��");
	}
}

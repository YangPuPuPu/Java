package API;

import java.util.Date;
/*
 * public Date();��ʾ���������ʱ�䣬��ȷ������
 * public Date(long date);����һ��date���󣬲������ʼ��Ϊ��ʾ�ӱ�׼��׼ʱ��ָ���ĺ�����
 */
public class DateDemo01 {
	public static void main(String[] args) {
		Date d1 =new Date();
		System.out.println(d1);
		
		Date d2 = new Date(1000*60*60);
		System.out.println(d2);
	}
}

package API;

import java.util.Date;

/*
 * public long getTime();��ȡ�����ڶ����Ǵ�1970��1��1�յ����ڵĺ���ֵ
 * public void setTime(long time);����ʱ������Ǻ���ֵ
 */
public class DateDemo02 {
	public static void main(String[] args) {
		//�������ڶ���
		Date d  = new Date();
		System.out.println(d.getTime()*1.0/1000/60/60/24/365+"��");
//		long time =1000*60*60;
		long time =System.currentTimeMillis();
		d.setTime(time);
		System.out.println(d);
	}
}

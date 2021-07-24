package API;

import java.util.Date;

/*
 * public long getTime();获取的日期对象是从1970年1月1日到现在的毫秒值
 * public void setTime(long time);设置时间给的是毫秒值
 */
public class DateDemo02 {
	public static void main(String[] args) {
		//创建日期对象
		Date d  = new Date();
		System.out.println(d.getTime()*1.0/1000/60/60/24/365+"年");
//		long time =1000*60*60;
		long time =System.currentTimeMillis();
		d.setTime(time);
		System.out.println(d);
	}
}

package API;

import java.util.Date;
/*
 * public Date();表示他被分配的时间，精确到毫秒
 * public Date(long date);分配一个date对象，并将其初始化为表示从标准基准时间指定的毫秒数
 */
public class DateDemo01 {
	public static void main(String[] args) {
		Date d1 =new Date();
		System.out.println(d1);
		
		Date d2 = new Date(1000*60*60);
		System.out.println(d2);
	}
}

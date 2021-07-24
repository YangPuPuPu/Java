package API;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 需求：获取任意一年的二月有多少天
 */
public class CalendarText {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int year = sc.nextInt();
		Calendar c= Calendar.getInstance();
		c.set(year, 02, 01);
		c.add(Calendar.DATE, -1);
		int day =c.get(Calendar.DATE);
		System.out.println(day);
	}
}

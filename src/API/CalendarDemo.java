package API;

import java.util.Calendar;

/*
 * 	Calendar 为某一时段和一组日历字段之间的转换提供了一些方法，并为操作日历字段提供了一些方法
 *  
 *  Calendar 提供了一个类方法getInstance用于获取Calendar对象，其日历字段已使用当前日期和时间初始化
 *  	Calendar rightNow = Calendar.gerInstance();
 */

/*
 * 	public abstract void add(int field,int amount);
 * 		根据日历的规则，将指定的时间量添加或者减去给定的日历字段
 * 	public final void set(int year,int month,int date);
 * 		设置当前日历的年月日
 */
public class CalendarDemo {
	public static void main(String[] args) {
		//获取对象
		Calendar c = Calendar.getInstance();//多态的形式
//		System.out.println(c);
		
		//public int get (int field)
		int year  = c.get(Calendar.YEAR);
		int month = c.get(	Calendar.MONTH)+1;
		int date = c.get(Calendar.DATE);
		System.out.println(year+"年"+month+"月"+date+"日");
		
		//public abstract void add(int field,int amount);
		//需求：10年后的5天前
		c.add(Calendar.YEAR,10);
		c.add(Calendar.DATE,-5);
		int year1  = c.get(Calendar.YEAR);
		int month1 = c.get(	Calendar.MONTH)+1;
		int date1 = c.get(Calendar.DATE);
		System.out.println(year1+"年"+month1+"月"+date1+"日");
	
		c.set(2021, 11, 15);
		int year2  = c.get(Calendar.YEAR);
		int month2 = c.get(	Calendar.MONTH)+1;
		int date2 = c.get(Calendar.DATE);
		System.out.println(year2+"年"+month2+"月"+date2+"日");
	}
}

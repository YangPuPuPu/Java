package API;

import java.text.ParseException;
import java.util.Date;

/*
 * 测试类
 */
public class DateDemo {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		String s = DateUtils.DateToString(d, "yyyy年MM月dd日 hh:mm:ss");
		System.out.println(s);
		
		String ss = "2020年11月12日 13:21:56";
		Date dd = DateUtils.StringToDate(ss, "yyyy年MM月dd日 hh:mm:ss");
		System.out.println(dd);
	}
}

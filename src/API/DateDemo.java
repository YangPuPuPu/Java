package API;

import java.text.ParseException;
import java.util.Date;

/*
 * ������
 */
public class DateDemo {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		String s = DateUtils.DateToString(d, "yyyy��MM��dd�� hh:mm:ss");
		System.out.println(s);
		
		String ss = "2020��11��12�� 13:21:56";
		Date dd = DateUtils.StringToDate(ss, "yyyy��MM��dd�� hh:mm:ss");
		System.out.println(dd);
	}
}

package API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 	工具类
 * 
 * 	构造方法私有
 * 	成员方法静态
 */
public class DateUtils {
	private DateUtils() {	
	}
	
	public static String DateToString(Date date,String Format) {
		SimpleDateFormat sdf =new SimpleDateFormat(Format);
		String s = sdf.format(date);
		return s;
	}
	public static Date StringToDate(String s ,String Format ) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(Format);
		Date d= sdf.parse(s);
		return d;
	}
}

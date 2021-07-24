package API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 构造方法：
 * 		public SimpleDateFormat();构造一个SimpleDateFormat,使用默认模式和日期格式
 * 		public SimpleDateFormat(String patten);构造一个SimpleDateFormat使用给定的模式和默认的日期格式
 * 
 * 格式化：从Date 到String
 * 			public final String format(Date date);将日期格式化成日期/时间字符串
 * 
 * 解析：从String 到Date
 * 		public Date parse(String sourse);从给定字符串的开始解析文本生成日期
 */
public class SimpleDateFormatDemo {
	public static void main(String[] args) throws ParseException {
		// 格式化
		Date d = new Date();
		// SimpleDateFormat sdf = new SimpleDateFormat();2021/3/12 下午7:19
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);
		System.out.println("--------");

		// 解析
		String ss = "2021-03-12 19:13:13";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date dd = sdf2.parse(ss);
		System.out.println(dd);
	}
}

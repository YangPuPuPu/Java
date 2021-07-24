package API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ���췽����
 * 		public SimpleDateFormat();����һ��SimpleDateFormat,ʹ��Ĭ��ģʽ�����ڸ�ʽ
 * 		public SimpleDateFormat(String patten);����һ��SimpleDateFormatʹ�ø�����ģʽ��Ĭ�ϵ����ڸ�ʽ
 * 
 * ��ʽ������Date ��String
 * 			public final String format(Date date);�����ڸ�ʽ��������/ʱ���ַ���
 * 
 * ��������String ��Date
 * 		public Date parse(String sourse);�Ӹ����ַ����Ŀ�ʼ�����ı���������
 */
public class SimpleDateFormatDemo {
	public static void main(String[] args) throws ParseException {
		// ��ʽ��
		Date d = new Date();
		// SimpleDateFormat sdf = new SimpleDateFormat();2021/3/12 ����7:19
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� hh:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);
		System.out.println("--------");

		// ����
		String ss = "2021-03-12 19:13:13";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date dd = sdf2.parse(ss);
		System.out.println(dd);
	}
}

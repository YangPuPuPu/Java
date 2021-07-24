package myCharStream;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * 	一个汉字存储：
 * 			如果是GBK编码，占用2个字节
 * 			如果是UTF-8编码，占用3个字节
 */
public class FileOutputStreamDemo01 {
	public static void main(String[] args) throws UnsupportedEncodingException {
//		String s ="abc";//[97, 98, 99]
		String s ="中国";//[-42, -48, -71, -6]
		
		byte[] bys = s.getBytes("UTF-8");//[-28, -72, -83, -27, -101, -67]
		System.out.println(Arrays.toString(bys));
	}
}

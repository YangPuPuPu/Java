package myCharStream;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * 	һ�����ִ洢��
 * 			�����GBK���룬ռ��2���ֽ�
 * 			�����UTF-8���룬ռ��3���ֽ�
 */
public class FileOutputStreamDemo01 {
	public static void main(String[] args) throws UnsupportedEncodingException {
//		String s ="abc";//[97, 98, 99]
		String s ="�й�";//[-42, -48, -71, -6]
		
		byte[] bys = s.getBytes("UTF-8");//[-28, -72, -83, -27, -101, -67]
		System.out.println(Arrays.toString(bys));
	}
}

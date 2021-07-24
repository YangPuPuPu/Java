package myByteStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 构造方法：
 * 		FileOutputStream​(String name) 创建文件输出流以指定的名称写入文件。  
 * 		FileOutputStream​(String name, boolean append) 创建文件输出流以指定的名称写入文件。  
 * 
 * 写数据的三种方式：
 * 		void write​(int b) 将指定的字节写入此文件输出流。  
 * 		一次只写一个字节数据
 * 		
 * 		void write​(byte[] b) 将 b.length字节从指定的字节数组写入此文件输出流。  
 * 		一次写一个字节数组
 * 	
 * 		void write​(byte[] b, int off, int len) 将 len字节从指定的字节数组开始，从偏移量 off开始写入此文件输出流。  
 * 		一次写部分字节数组
 * 		
 * 		byte[] getBytes​() 返回字符串对应的字节数组
 */
public class FileOutputStreamDemo02 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("D:\\develop\\Project\\java.txt");
//		FileOutputStream fos = new FileOutputStream(new File ("D:\\develop\\Project\\java.txt"));
		//这里括号里面new File(name)其实就是一个File对象
		
		//将指定的字节流写入文件
//		fos.write(97);
//		fos.write(98);
//		fos.write(99);
//		fos.write(100);
//		fos.write(101);
		
		//将 b.length字节从指定的字节数组写入此文件输出流。
		byte[] bys = {
				97,98,99,100,101
		};
//		fos.write(bys);
		
		//或者使用字符串返回byte数组
		//byte[] getBytes​() 返回字符串对应的字节数组
//		String  s = "abcde";
//		fos.write(s.getBytes());
		
		//将 len字节从指定的字节数组开始，从偏移量 off开始写入此文件输出流。
		fos.write(bys, 1, 3);//bcd
		
		//释放资源
		fos.close();
	}
}

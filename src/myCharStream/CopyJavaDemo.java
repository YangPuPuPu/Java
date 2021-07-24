package myCharStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 	需求：
 * 		把模块目录下的java文件复制到另一个目录下
 */
public class CopyJavaDemo {
	public static void main(String[] args) throws IOException {
		//创建字符输入流对象
		InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\develop\\Project\\123\\src\\myCharStream\\StringDemo.java"));
		//创建字符输出流对象
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\develop\\Project\\javaee.java")); 
	
//		int ch;
//		while((ch=isr.read())!=-1) {
//			osw.write((char)ch);
//		}
		
		int len;
		char[] chs= new char[1024];
		while((len=isr.read(chs))!=-1) {
			osw.write(chs);
		}
		
		isr.close();
		osw.close();
	}
}

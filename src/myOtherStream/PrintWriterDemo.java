package myOtherStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * PrintWriter​(String fileName) 使用指定的文件名创建一个新的PrintWriter，而不需要自动执行行刷新。 
 * PrintWriter​(Writer out, boolean autoFlush) 创建一个新的PrintWriter。  
 * out:字符输出流
 * 
 */
public class PrintWriterDemo {
	public static void main(String[] args) throws IOException{
//		PrintWriter​(String fileName) 使用指定的文件名创建一个新的PrintWriter，而不需要自动执行行刷新。 
//	PrintWriter pw = new PrintWriter("D:\\develop\\Project\\java.txt");
	
//	pw.write("hello");
//	pw.write("\r\n");
//	pw.flush();
//	pw.write("world");
//	pw.flush();
	
//	pw.println("hello");
//	pw.flush();
//	pw.println("world");
//	pw.flush();
	//PrintWriter​(Writer out, boolean autoFlush) 创建一个新的PrintWriter。
		PrintWriter pw = new PrintWriter(new FileWriter("D:\\develop\\Project\\java.txt"),true);
	pw.println("hello");
	pw.println("world");
	
	pw.close();
	}
}

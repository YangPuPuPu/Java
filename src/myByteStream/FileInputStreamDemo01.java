package myByteStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 	需求：
 * 		把文件java.txt中的内容取出来再控制台输出
 * 
 * 	FileInputSteam:从文件系统中的文件获取输入字节
 * 		File​(String pathname) 通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。  
 * 		
 * 	
 */
public class FileInputStreamDemo01 {
	public static void main(String[] args) throws IOException {
		//创建对象
		FileInputStream fis = new FileInputStream("D:\\develop\\Project\\java.txt");
		
		//调用字节输入流对象的读数据方法
		//int read(); 从改输入流读取一个字节的数据
		/*
		int by = fis.read();
		System.out.println(by);
		System.out.println((char)by);
		*/
		
		//如果达到文件的末尾：就会输出-1
		//所以可以使用循环输出文件内的内容
		
		int by;//这就是字符输入流标准读取数据格式
		/*
		 * fis.read();读数据
		 * by=fis.read();把数据赋值给by
		 * by！=-1;判断数据等不等于-1
		 */
		while((by=fis.read())!=-1) {
			System.out.print((char)by);
		}
		
		//释放资源
		fis.close();
	}
}

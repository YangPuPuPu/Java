package myByteStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 	字节流写数据的两个小问题：
 * 		1.字节流写数据如何实现换行？
 * 		Windows：\r\n
 * 		Linux:\n
 * 		mac:\r
 * 
 * 		2.字节流写的数据如何实现追加写入呢？
 * 			FileOutputStream​(String name, boolean append) 
 * 				创建文件输出流以指定的名称写入文件。
 * 				如果第二个参数为true，则字节将写入文件的末尾而不是开头  
 */
public class FileOutputStreamDemo03 {
	public static void main(String[] args) throws IOException {
		//创建字符输出流对象
//		FileOutputStream fos = new FileOutputStream("D:\\develop\\Project\\java.txt");
		FileOutputStream fos = new FileOutputStream("D:\\develop\\Project\\java.txt",true);
		//这里实现的是追加的操作
		
		//写数据
		for(int i =0;i<10;i++) {
			fos.write("hello".getBytes());
			fos.write("\n".getBytes());//这里实现换行操作
		}
		
		//释放资源
		fos.close();
	}
}

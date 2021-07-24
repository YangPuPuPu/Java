package myByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 	需求：
 * 		把java.txt文件内容复制到javase.txt文件内部
 */
public class CopyTxtDemo {
	public static void main(String[] args) throws IOException {
		//创建字符输出流对象
		FileOutputStream fos = new FileOutputStream("D:\\develop\\Project\\javase.txt");
		//创建字符输入流对象
		FileInputStream fis = new FileInputStream("D:\\develop\\Project\\java.txt");
	
		//循环遍历取数据
		int by;
		while((by=fis.read())!=-1) {
			fos.write((char)by);
		}
		
		//释放资源
		fis.close();
		fos.close();
	}
}

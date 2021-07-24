package myByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 需求：把文件java.txt中的内容取出来再控制台输出
 */
public class FileInputStreamDemo02 {
	public static void main(String[] args) throws IOException {
		//创建字符输入流
		FileInputStream fis = new FileInputStream("D:\\develop\\Project\\java.txt");
		
		//调用字节输入流对象的读数据方法
		//int read(byte[] b);从该输入流读取最多b.length个字节的数据到一个字节数组
		byte[] bys = new byte[1024];//一般都是1024或者1024的整数倍
		int len;//len表示读取的字节数//在换行位置也会读取换行符
		while((len=fis.read(bys))!=-1) {
			//String​(byte[] bytes, int offset, int length) 
			//通过使用平台的默认字符集解码指定的字节子阵列来构造新的 String 。  
			System.out.print(new String(bys,0,len));
		}
		
		//释放资源
		fis.close();
	}
}

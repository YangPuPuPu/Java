package myCharStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 使用字符输出输入流子类升级案例
 */
public class CopyJavaDemo02 {
	public static void main(String[] args) throws IOException {
		//使用数据源创建对象
		FileReader fr = new FileReader("D:\\develop\\Project\\123\\src\\myCharStream\\StringDemo.java");
		FileWriter fw =new FileWriter("D:\\develop\\Project\\javaee.java");
		
		//读取数据
//		int ch;
//		while((ch=fr.read())!=-1) {
//			fw.write((char)ch);
//		}
		
		int len;
		char[] chs = new char[1024];
		while((len=fr.read(chs))!=-1) {
			fw.write(chs);
		}
		//释放资源
		fw.close();
		fr.close();
	}
}

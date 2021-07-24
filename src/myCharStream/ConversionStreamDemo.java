package myCharStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 	InputStreamReader是从字节流到字符流的桥梁：
 * 					 它读取字节，并使用指定的charset将其解码为字符。 
 * 					 它使用的字符集可以由名称指定，也可以被明确指定，
 * 					 或者可以接受平台的默认字符集。
 * 	
 * 	OutputStreamWriter是从字符流到字节流的桥梁：
 * 					  使用指定的charset将写入的字符编码为字节。 
 * 					  它使用的字符集可以由名称指定，也可以被明确指定，
 * 					  或者可以接受平台的默认字符集。 
 */
public class ConversionStreamDemo {
	public static void main(String[] args) throws IOException{
		//构造方法：
//		OutputStreamWriter​(OutputStream out) 创建一个使用默认字符编码的OutputStreamWriter。  
//		OutputStreamWriter​(OutputStream out, String charsetName) 创建一个使用命名字符集的OutputStreamWriter。  

//		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\develop\\Project\\java.txt"));
//		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\develop\\Project\\java.txt"),"UTF-8");
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\develop\\Project\\java.txt"),"GBK");
		osw.write("中国");
		osw.close();
		
		//构造方法：
//		InputStreamReader​(InputStream in) 创建一个使用默认字符集的InputStreamReader。  
//		InputStreamReader​(InputStream in, String charsetName) 创建一个使用命名字符集的InputStreamReader。  
		
//		InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\develop\\Project\\java.txt"));
//		InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\develop\\Project\\java.txt"),"UTF-8");
		InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\develop\\Project\\java.txt"),"GBK");
		//一次读取一个字符
		int ch;
		while((ch=isr.read())!=-1) {
			System.out.print((char)ch);
		}
		
		//释放资源
		isr.close();
	}
}

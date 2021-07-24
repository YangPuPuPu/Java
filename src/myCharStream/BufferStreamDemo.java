package myCharStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 	字符缓冲流：
 * 		 BufferedReader 从字符输入流读取文本，缓冲字符，以提供字符，数组和行的高效读取。 
						可以指定缓冲区大小，或者可以使用默认大小。 默认值足够大，可用于大多数用途。
		 BufferedWriter 将文本写入字符输出流，缓冲字符，以提供单个字符，数组和字符串的高效写入。 
					    可以指定缓冲区大小，或者可以接受默认大小。 默认值足够大，可用于大多数用途。
	
	构造方法：
			BufferedWriter​(Writer out) 创建使用默认大小的输出缓冲区的缓冲字符输出流。  
			BufferedReader​(Reader in) 创建使用默认大小的输入缓冲区的缓冲字符输入流。 
 */
public class BufferStreamDemo {
public static void main(String[] args) throws IOException {
	//创建对象
	BufferedReader br = new BufferedReader(new FileReader("D:\\develop\\Project\\java.txt"));
//	BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\develop\\Project\\java.txt"));
	
//	//写入数据
//	bw.write("hello\r\n");
//	bw.write("world\r\n");
//	bw.write("java\r\n");
	
	//读取数据
//	int ch;
//	while((ch=br.read())!=-1) {
//		System.out.print((char)ch);
//	}
	
	int len;
	char[] chs =new char[1024];
	while((len=br.read(chs))!=-1) {
		System.out.println(new String(chs,0,len));
	}
	//释放资源
//	bw.close();
	br.close();
}
}

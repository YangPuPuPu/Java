package myByteStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 	字节缓冲流：
 * 		BufferedOutputStream
 * 		BufferedInputStream
 * 
 * 	构造方法：
 * 		字节缓冲输出流：BufferedOutputStream​(OutputStream out) 
 * 					  创建一个新的缓冲输出流，以将数据写入指定的底层输出流。
 * 		字节缓冲输入流：BufferedInputStream​(InputStream in) 创建一个 BufferedInputStream
 * 					  并保存其参数，输入流 in供以后使用。  
 */
public class BufferStreamDemo {
	public static void main(String[] args) throws IOException{
//		FileOutputStream fos = new FileOutputStream("D:\\develop\\Project\\java.txt");
//		BufferedOutputStream bos = new BufferedOutputStream(fos); 
		/*
		//创建对象
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\develop\\Project\\java.txt")); 
		
		//写数据
		bos.write("hello".getBytes());
		bos.write("\r\n".getBytes());
		bos.write("world".getBytes());
		
		//释放资源
		bos.close();
		*/
		
		//创建对象
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\develop\\Project\\java.txt"));
	
		//读数据
		/*
		int by;
		while((by=bis.read())!=-1) {
			System.out.print((char)by);
		}
		*/
		byte[] bys = new byte[1024];
		int len;
		while((len=bis.read(bys))!=-1) {
			System.out.println(new String(bys,0,len));
		}
		
		//释放资源
		bis.close();
	}
}

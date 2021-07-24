package myByteStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 字节流写数据加入异常处理
 */
public class FileOutputDemo04 {
	public static void main(String[] args) {
//		try {
//		FileOutputStream fos = new FileOutputStream("D:\\develop\\Project\\java.txt");
//		fos.write("hello".getBytes());
//		fos.close();
//		}catch(IOException e){
//			e.printStackTrace();
//		}
		
		//加入finally来实现释放资源
		FileOutputStream fos=null;
		try {
			fos = new FileOutputStream("D:\\develop\\Project\\java.txt");
//			fos = new FileOutputStream("E:\\develop\\Project\\java.txt");
			fos.write("hello".getBytes());
//			fos.close();
		}catch(IOException e){
				e.printStackTrace();
		}finally {//可能释放资源不会执行就直接到了catch所以要是用finally来一定执行释放资源的代码
			if(fos!=null) {
				try {//这里close也发现io异常所以使用try-catch来抛出异常
					fos.close();//这里fos接收不到try里的对象fos所以要定义在try外面
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}
}

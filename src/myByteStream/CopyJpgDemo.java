package myByteStream;
//input就是输入读取文件//output就是输出就是写文件就是输出到文件
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 	需求：
 * 		把一个图片复制到另一个文件下
 */
public class CopyJpgDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("D:\\develop\\Project\\mm.jpg");
		FileInputStream fis = new FileInputStream("D:\\develop\\Project\\mn.jpg");
	
		//读写数据
		byte[] bys = new byte[1024];
		int len;
		while((len=fis.read(bys))!=-1) {
			fos.write(bys,0,len);
		}
		
		//释放资源
		fis.close();
		fos.close();
	}
}

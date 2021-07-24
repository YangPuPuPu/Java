package myCharStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 使用字符缓冲流实现
 */
public class CopyJavaDemo03 {
	public static void main(String[] args) throws IOException {
		//创建缓冲流对象
		BufferedReader br = new BufferedReader(new FileReader("D:\\develop\\Project\\123\\src\\myCharStream\\StringDemo.java"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\develop\\Project\\javaee.java"));
		
		//复制
		char[] chs = new char[1024];
		int len;
		while((len = br.read(chs))!=-1) {
			bw.write(chs,0,len);
		}
		//释放资源
		br.close();
		bw.close();
	
	
	
	}
}

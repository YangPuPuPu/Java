package myOtherStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyJavaDemo {
	public static void main(String[] args) throws IOException{
		//根据数据源创建字符输入流对象
		BufferedReader br = new BufferedReader(new FileReader("D:\\develop\\Project\\java.txt"));
		//根据目的地目录创建字符输出流对象
		PrintWriter pw = new PrintWriter("D:\\develop\\Project\\javase.txt");
		
		String line;
		while((line = br.readLine())!=null) {
			pw.println(line);
		}
		
		pw.close();
		br.close();
	}
}

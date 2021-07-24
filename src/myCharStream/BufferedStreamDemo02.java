package myCharStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 		BufferedReader特有方法：
 * 			String readLine​() 读一行文字。  
 * 			一个包含行的内容的字符串，不包括任何行终止字符，如果没有读取任何字符，如果流的结尾已经到达，则为null 
 		BufferedWriter特有方法：
 			void newLine​() 写一行行分隔符。  
 *
 */
public class BufferedStreamDemo02 {
	public static void main(String[] args) throws IOException {
//		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\develop\\Project\\java.txt"));
//		
//		for(int i =0;i<10;i++) {
//			bw.write("hello"+i);
//			bw.newLine();//换行
//			bw.flush();
//		}
//		bw.close();
		
		BufferedReader br = new BufferedReader(new FileReader("D:\\develop\\Project\\java.txt"));
		
		String s = new String();
		while((s=br.readLine())!=null) {//每次读取一行内容，读到末尾就会返回null
			System.out.println(s);//不能读取换行符
		}
	}
}

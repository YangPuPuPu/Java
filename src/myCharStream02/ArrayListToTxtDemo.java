package myCharStream02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 	需求：将集合元素中的字符串元素添加到TXT文件中
 */
public class ArrayListToTxtDemo {
	public static void main(String[] args) throws IOException{
		//创建集合元素
		ArrayList<String> array = new ArrayList<>();
		
		//添加元素
		array.add("hello");
		array.add("world");
		array.add("java");
		
		//创建字节缓冲输出流对象
		BufferedWriter bw  = new BufferedWriter(new FileWriter("D:\\develop\\Project\\java.txt"));
		
		//遍历集合添加元素
		for(String s:array) {
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}

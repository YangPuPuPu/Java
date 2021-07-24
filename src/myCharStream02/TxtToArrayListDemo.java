package myCharStream02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 	需求：将TXT文件中的数据读取到ArrayList集合中
 */
public class TxtToArrayListDemo {
	public static void main(String[] args) throws IOException{
		//创建一个字节缓冲输入流对象
		BufferedReader br = new BufferedReader(new FileReader("D:\\develop\\Project\\java.txt"));
		
		//创建集合对象
		ArrayList<String> array = new ArrayList<>();
		
		//读取数据添加到ArrayList集合
		String s = new String();
		while((s=br.readLine())!=null) {
			array.add(s);
		}
		
		//释放资源
		br.close();
		
		//遍历集合
		for(String ss: array) {
			System.out.println(ss);
		}
	}
}

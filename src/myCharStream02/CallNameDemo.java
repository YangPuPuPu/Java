package myCharStream02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
 * 需求：一个文件存储班级所有同学姓名，要求通过程序实现随机点名
 */
public class CallNameDemo {
	public static void main(String[] args) throws IOException{
		//创建字节缓冲输入流对象
		BufferedReader br = new BufferedReader(new FileReader("D:\\develop\\Project\\java.txt"));
		
		//创建集合用来存储TXT文件数据
		ArrayList<String> array = new ArrayList<>();
		
		String Line = new String();
		while((Line = br.readLine())!=null) {
			array.add(Line);
		}
		
		//释放资源
		br.close();
		
		//创建随机数
		Random r = new Random();
		int index = r.nextInt(array.size());
		
		//获取对应索引处的元素
		String name = array.get(index);
		
		//输出
		System.out.println("幸运儿是"+name);
	}
}

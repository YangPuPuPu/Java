package myOtherStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

/*
 * 	打印流特点：
 * 		只负责输出数据，不负责读取数据
 * 		有自己的特有方法
 * PrintStream​(String fileName) 使用指定的文件名创建新的打印流，无需自动换行。  
 */
public class PrintStreamDemo {
	public static void main(String[] args) throws IOException {
		//PrintStream​(String fileName)
		PrintStream ps = new PrintStream("D:\\develop\\Project\\java.txt");
		//写数据
		ps.write(97);
		//使用特有方法写数据
		ps.println(97);
		ps.println(98);
		
		//释放资源
		ps.close();
	}
}

package myFile;

import java.io.File;
import java.io.IOException;

/*
 * public boolean delete();删除由此路径名表示的文件或者目录
 */
public class FileDemo04 {
	public static void main(String[] args) throws IOException {
		//需求1：在当前模块目录下创建Java文件
		File f1 = new File("D:\\develop\\Project\\java.txt");
		System.out.println(f1.createNewFile());
		
		//需求2：删除当前目录下的java.txt文件
		System.out.println(f1.delete());
		System.out.println("-----------");
		
		//需求3：在当前目录下创建目录
		File f2 = new File("D:\\develop\\Project\\JavaSE");
		System.out.println(f2.mkdir());
		
		//需求4:删除当前模块目录下的目录
		System.out.println(f2.delete());
		System.out.println("-----------");
		//删除含有文件的目录时，要先删除目录里面的文件再删除目录
	}
}

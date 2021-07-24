package myFile;

import java.io.File;
import java.io.IOException;

/*
 * File类创建功能
 * 		public boolean creatNewFile();当具有该类型的文件不存在时，创建一个由该抽象路径名命名的新空文件
 * 			如果文件不存在，就创建文件，并返回true
 * 			如果文件存在，就不创建文件，并返回false
 * 		
 * 		public boolean mkdir();创建由此抽象路径命名的目录
 * 		public boolean mkdir();创建由此抽象路径名命名的目录，包括任何必须但不存在的父目录
 * 
 */
public class FileDemo02 {
	public static void main(String[] args) throws IOException {
		//需求1：在D:\develop\Project目录下创建一个文件java.txt
		File f1 = new File("D:\\develop\\Project\\java.txt");
		System.out.println(f1.createNewFile());
		
		//需求2：在D:\develop\Project目录下创建一个目录JavaSE
		File f2 = new File("D:\\develop\\Project\\JavaSE");
		System.out.println(f2.mkdir());
		
		//需求3：在D:\develop\Project目录下创建一个多级目录JavaWEB\\HTML
		File f3 = new File("D:\\develop\\Project\\JavaWEB\\HTML");
		System.out.println(f3.mkdirs());
	}
}

package myFile;

import java.io.File;

/*
 * File类的判断和获取功能：
 * 		public boolean isDiectary();测试在此抽象路径名表示的File是否为目录
 * 		public boolean isFile();测试此抽象路径名表示的File是否为文件
 * 		public boolean exists();测试此抽象路径名表示的File文件是否存在
 * 
 * 		public String getAbsolutePath();返回此抽象路径名的绝对路径名字符串
 * 		public String getPath();将此抽象路径名转换为路径名字字符串
 * 		public String getName();返回由此抽象路径名字表示的文件或目录的名称
 * 
 * 		public String[] list();返回此抽象路径名表示的目录中的文件和目录下的名称字符串数组
 * 		public File[] listFile[];返回此抽象路径名表示的目录中的文件和目录的File对象数组
 */
public class FileDemo03 {
	public static void main(String[] args) {
		//创建一个File对象
		File f1 = new File("D:\\develop\\Project\\java.txt");
		
//		public boolean isDiectary();测试在此抽象路径名表示
// 		public boolean isFile();测试此抽象路径名表示的File是否为文件
//		public boolean exists();测试此抽象路径名表示的File文件是否存在
		System.out.println(f1.isDirectory());
		System.out.println(f1.isFile());
		System.out.println(f1.exists());
		
//		public String getAbsolutePath();返回此抽象路径名的绝对路径名字符串
//		public String getPath();将此抽象路径名转换为路径名字字符串
//		public String getName();返回由此抽象路径名字表示的文件或目录的名称
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getPath());
		System.out.println(f1.getName());
		System.out.println("---------------");
		
//		public String[] list();返回此抽象路径名表示的目录中的文件和目录下的名称字符串数组
//		public File[] listFiles();返回此抽象路径名表示的目录中的文件和目录的File对象数组
		File f= new File("D:\\develop\\Project");
		String[] s = f.list();
		for(String s1:s) {
			System.out.println(s1);
		}
		System.out.println("--------");
		
		File[] f2 = f.listFiles();
		for(File f3:f2) {
			System.out.println(f3);
			System.out.println(f3.getName());
		}
	}

}

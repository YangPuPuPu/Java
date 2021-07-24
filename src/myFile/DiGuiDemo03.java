package myFile;

import java.io.File;

/*
 * 使用递归遍历文件
 */
public class DiGuiDemo03 {
	public static void main(String[] args) {
		//根据给定的路径创建一个File对象
		File f1 = new File("D:\\develop\\Project\\123\\src");
		getAllFilePath(f1);
		//
	}
	//定义一个方法，用于获取给定目录下的所有内容，参数为第一步创建的File对象
	public static void getAllFilePath(File srcFile) {
		//获取给定的File给定File目录下的所有文件或者目录的File数组
		// File[] listFiles​() 返回一个抽象路径名数组，表示由该抽象路径名表示的目录中的文件。 
		File[] fileArray = srcFile.listFiles();
		//遍历该数组
		if(fileArray!=null) {
			for(File file:fileArray) {
				if(file.isFile()) {
					System.out.println(file.getAbsolutePath());
				}
				else {
					getAllFilePath(file);
				}
			}
		}
	}
}

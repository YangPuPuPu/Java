package myFile;

import java.io.File;
import java.io.IOException;

/*
 * public boolean delete();ɾ���ɴ�·������ʾ���ļ�����Ŀ¼
 */
public class FileDemo04 {
	public static void main(String[] args) throws IOException {
		//����1���ڵ�ǰģ��Ŀ¼�´���Java�ļ�
		File f1 = new File("D:\\develop\\Project\\java.txt");
		System.out.println(f1.createNewFile());
		
		//����2��ɾ����ǰĿ¼�µ�java.txt�ļ�
		System.out.println(f1.delete());
		System.out.println("-----------");
		
		//����3���ڵ�ǰĿ¼�´���Ŀ¼
		File f2 = new File("D:\\develop\\Project\\JavaSE");
		System.out.println(f2.mkdir());
		
		//����4:ɾ����ǰģ��Ŀ¼�µ�Ŀ¼
		System.out.println(f2.delete());
		System.out.println("-----------");
		//ɾ�������ļ���Ŀ¼ʱ��Ҫ��ɾ��Ŀ¼������ļ���ɾ��Ŀ¼
	}
}

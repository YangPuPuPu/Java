package myFile;

import java.io.File;
import java.io.IOException;

/*
 * File�ഴ������
 * 		public boolean creatNewFile();�����и����͵��ļ�������ʱ������һ���ɸó���·�����������¿��ļ�
 * 			����ļ������ڣ��ʹ����ļ���������true
 * 			����ļ����ڣ��Ͳ������ļ���������false
 * 		
 * 		public boolean mkdir();�����ɴ˳���·��������Ŀ¼
 * 		public boolean mkdir();�����ɴ˳���·����������Ŀ¼�������κα��뵫�����ڵĸ�Ŀ¼
 * 
 */
public class FileDemo02 {
	public static void main(String[] args) throws IOException {
		//����1����D:\develop\ProjectĿ¼�´���һ���ļ�java.txt
		File f1 = new File("D:\\develop\\Project\\java.txt");
		System.out.println(f1.createNewFile());
		
		//����2����D:\develop\ProjectĿ¼�´���һ��Ŀ¼JavaSE
		File f2 = new File("D:\\develop\\Project\\JavaSE");
		System.out.println(f2.mkdir());
		
		//����3����D:\develop\ProjectĿ¼�´���һ���༶Ŀ¼JavaWEB\\HTML
		File f3 = new File("D:\\develop\\Project\\JavaWEB\\HTML");
		System.out.println(f3.mkdirs());
	}
}

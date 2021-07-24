package myFile;

import java.io.File;

/*
 * File����жϺͻ�ȡ���ܣ�
 * 		public boolean isDiectary();�����ڴ˳���·������ʾ��File�Ƿ�ΪĿ¼
 * 		public boolean isFile();���Դ˳���·������ʾ��File�Ƿ�Ϊ�ļ�
 * 		public boolean exists();���Դ˳���·������ʾ��File�ļ��Ƿ����
 * 
 * 		public String getAbsolutePath();���ش˳���·�����ľ���·�����ַ���
 * 		public String getPath();���˳���·����ת��Ϊ·�������ַ���
 * 		public String getName();�����ɴ˳���·�����ֱ�ʾ���ļ���Ŀ¼������
 * 
 * 		public String[] list();���ش˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼�µ������ַ�������
 * 		public File[] listFile[];���ش˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼��File��������
 */
public class FileDemo03 {
	public static void main(String[] args) {
		//����һ��File����
		File f1 = new File("D:\\develop\\Project\\java.txt");
		
//		public boolean isDiectary();�����ڴ˳���·������ʾ
// 		public boolean isFile();���Դ˳���·������ʾ��File�Ƿ�Ϊ�ļ�
//		public boolean exists();���Դ˳���·������ʾ��File�ļ��Ƿ����
		System.out.println(f1.isDirectory());
		System.out.println(f1.isFile());
		System.out.println(f1.exists());
		
//		public String getAbsolutePath();���ش˳���·�����ľ���·�����ַ���
//		public String getPath();���˳���·����ת��Ϊ·�������ַ���
//		public String getName();�����ɴ˳���·�����ֱ�ʾ���ļ���Ŀ¼������
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getPath());
		System.out.println(f1.getName());
		System.out.println("---------------");
		
//		public String[] list();���ش˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼�µ������ַ�������
//		public File[] listFiles();���ش˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼��File��������
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

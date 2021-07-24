package myFile;

import java.io.File;

/*
 * 	File���ļ���Ŀ¼·�����ĳ����ʾ
 * 		1:�ļ���Ŀ¼�ǿ���ͨ��File��װ�ɶ����
 * 		2������File���ԣ����װ�Ĳ�����һ���������ڵ��ļ���������һ��·�������ѡ��������Ǵ��ڵģ�Ҳ�����ǲ����ڵġ�
 * 		������Ҫͨ������Ĳ��������·��������ת��Ϊ������ڵ�
 * 	���췽����
 * 		File(String pathname):ͨ����������·�����ַ���ת��Ϊ����·�������������µ�Fileʵ��
 * 		File(String parent,String child);�Ӹ�·�����ַ�������·�����ַ��������µ�Fileʵ��
 * 		File(String parent,String child);�Ӹ�����·��������·���ַ��������µ�Fileʵ��
 * 
 */
public class FileDemo01 {
	public static void main(String[] args) {
		//File(String pathname):ͨ����������·�����ַ���ת��Ϊ����·�������������µ�Fileʵ��
		File f1 = new File("D:\\develop\\Project\\java.txt");
		System.out.println(f1);
		
		//File(String parent,String child);�Ӹ�·�����ַ�������·�����ַ��������µ�Fileʵ��
		File f2 = new File("D:\\develop\\Project","java.txt");
		System.out.println(f2);
		
		//File(String parent,String child);�Ӹ�����·��������·���ַ��������µ�Fileʵ��
		File f3 =new File("D:\\develop\\Project");
		File f4 =new File(f3,"java.txt");
		System.out.println(f4);
	}
}

package myCharStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ʹ���ַ����������������������
 */
public class CopyJavaDemo02 {
	public static void main(String[] args) throws IOException {
		//ʹ������Դ��������
		FileReader fr = new FileReader("D:\\develop\\Project\\123\\src\\myCharStream\\StringDemo.java");
		FileWriter fw =new FileWriter("D:\\develop\\Project\\javaee.java");
		
		//��ȡ����
//		int ch;
//		while((ch=fr.read())!=-1) {
//			fw.write((char)ch);
//		}
		
		int len;
		char[] chs = new char[1024];
		while((len=fr.read(chs))!=-1) {
			fw.write(chs);
		}
		//�ͷ���Դ
		fw.close();
		fr.close();
	}
}

package myCharStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 	����
 * 		��ģ��Ŀ¼�µ�java�ļ����Ƶ���һ��Ŀ¼��
 */
public class CopyJavaDemo {
	public static void main(String[] args) throws IOException {
		//�����ַ�����������
		InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\develop\\Project\\123\\src\\myCharStream\\StringDemo.java"));
		//�����ַ����������
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\develop\\Project\\javaee.java")); 
	
//		int ch;
//		while((ch=isr.read())!=-1) {
//			osw.write((char)ch);
//		}
		
		int len;
		char[] chs= new char[1024];
		while((len=isr.read(chs))!=-1) {
			osw.write(chs);
		}
		
		isr.close();
		osw.close();
	}
}

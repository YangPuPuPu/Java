package myByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 	����
 * 		��java.txt�ļ����ݸ��Ƶ�javase.txt�ļ��ڲ�
 */
public class CopyTxtDemo {
	public static void main(String[] args) throws IOException {
		//�����ַ����������
		FileOutputStream fos = new FileOutputStream("D:\\develop\\Project\\javase.txt");
		//�����ַ�����������
		FileInputStream fis = new FileInputStream("D:\\develop\\Project\\java.txt");
	
		//ѭ������ȡ����
		int by;
		while((by=fis.read())!=-1) {
			fos.write((char)by);
		}
		
		//�ͷ���Դ
		fis.close();
		fos.close();
	}
}

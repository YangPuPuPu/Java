package myCharStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ʹ���ַ�������ʵ��
 */
public class CopyJavaDemo03 {
	public static void main(String[] args) throws IOException {
		//��������������
		BufferedReader br = new BufferedReader(new FileReader("D:\\develop\\Project\\123\\src\\myCharStream\\StringDemo.java"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\develop\\Project\\javaee.java"));
		
		//����
		char[] chs = new char[1024];
		int len;
		while((len = br.read(chs))!=-1) {
			bw.write(chs,0,len);
		}
		//�ͷ���Դ
		br.close();
		bw.close();
	
	
	
	}
}

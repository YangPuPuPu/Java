package myCharStream02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 	���󣺽�����Ԫ���е��ַ���Ԫ����ӵ�TXT�ļ���
 */
public class ArrayListToTxtDemo {
	public static void main(String[] args) throws IOException{
		//��������Ԫ��
		ArrayList<String> array = new ArrayList<>();
		
		//���Ԫ��
		array.add("hello");
		array.add("world");
		array.add("java");
		
		//�����ֽڻ������������
		BufferedWriter bw  = new BufferedWriter(new FileWriter("D:\\develop\\Project\\java.txt"));
		
		//�����������Ԫ��
		for(String s:array) {
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}

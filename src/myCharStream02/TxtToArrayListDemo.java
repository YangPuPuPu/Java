package myCharStream02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 	���󣺽�TXT�ļ��е����ݶ�ȡ��ArrayList������
 */
public class TxtToArrayListDemo {
	public static void main(String[] args) throws IOException{
		//����һ���ֽڻ�������������
		BufferedReader br = new BufferedReader(new FileReader("D:\\develop\\Project\\java.txt"));
		
		//�������϶���
		ArrayList<String> array = new ArrayList<>();
		
		//��ȡ������ӵ�ArrayList����
		String s = new String();
		while((s=br.readLine())!=null) {
			array.add(s);
		}
		
		//�ͷ���Դ
		br.close();
		
		//��������
		for(String ss: array) {
			System.out.println(ss);
		}
	}
}

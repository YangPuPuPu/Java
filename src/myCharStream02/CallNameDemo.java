package myCharStream02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*
 * ����һ���ļ��洢�༶����ͬѧ������Ҫ��ͨ������ʵ���������
 */
public class CallNameDemo {
	public static void main(String[] args) throws IOException{
		//�����ֽڻ�������������
		BufferedReader br = new BufferedReader(new FileReader("D:\\develop\\Project\\java.txt"));
		
		//�������������洢TXT�ļ�����
		ArrayList<String> array = new ArrayList<>();
		
		String Line = new String();
		while((Line = br.readLine())!=null) {
			array.add(Line);
		}
		
		//�ͷ���Դ
		br.close();
		
		//���������
		Random r = new Random();
		int index = r.nextInt(array.size());
		
		//��ȡ��Ӧ��������Ԫ��
		String name = array.get(index);
		
		//���
		System.out.println("���˶���"+name);
	}
}

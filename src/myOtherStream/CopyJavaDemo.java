package myOtherStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyJavaDemo {
	public static void main(String[] args) throws IOException{
		//��������Դ�����ַ�����������
		BufferedReader br = new BufferedReader(new FileReader("D:\\develop\\Project\\java.txt"));
		//����Ŀ�ĵ�Ŀ¼�����ַ����������
		PrintWriter pw = new PrintWriter("D:\\develop\\Project\\javase.txt");
		
		String line;
		while((line = br.readLine())!=null) {
			pw.println(line);
		}
		
		pw.close();
		br.close();
	}
}

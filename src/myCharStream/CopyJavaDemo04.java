package myCharStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ʹ���ַ����������й���ʵ���ļ�����
 */
public class CopyJavaDemo04 {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new FileReader("D:\\develop\\Project\\java.txt"));
	BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\develop\\Project\\javase.txt"));
	
	String s;
	while((s=br.readLine())!=null) {
		bw.write(s);
		bw.newLine();
		bw.flush();
	}
	
	//�ͷ���Դ
	bw.close();
	br.close();
}
}

package myByteStream;
//input���������ȡ�ļ�//output�����������д�ļ�����������ļ�
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 	����
 * 		��һ��ͼƬ���Ƶ���һ���ļ���
 */
public class CopyJpgDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("D:\\develop\\Project\\mm.jpg");
		FileInputStream fis = new FileInputStream("D:\\develop\\Project\\mn.jpg");
	
		//��д����
		byte[] bys = new byte[1024];
		int len;
		while((len=fis.read(bys))!=-1) {
			fos.write(bys,0,len);
		}
		
		//�ͷ���Դ
		fis.close();
		fos.close();
	}
}

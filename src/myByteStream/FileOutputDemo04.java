package myByteStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ֽ���д���ݼ����쳣����
 */
public class FileOutputDemo04 {
	public static void main(String[] args) {
//		try {
//		FileOutputStream fos = new FileOutputStream("D:\\develop\\Project\\java.txt");
//		fos.write("hello".getBytes());
//		fos.close();
//		}catch(IOException e){
//			e.printStackTrace();
//		}
		
		//����finally��ʵ���ͷ���Դ
		FileOutputStream fos=null;
		try {
			fos = new FileOutputStream("D:\\develop\\Project\\java.txt");
//			fos = new FileOutputStream("E:\\develop\\Project\\java.txt");
			fos.write("hello".getBytes());
//			fos.close();
		}catch(IOException e){
				e.printStackTrace();
		}finally {//�����ͷ���Դ����ִ�о�ֱ�ӵ���catch����Ҫ����finally��һ��ִ���ͷ���Դ�Ĵ���
			if(fos!=null) {
				try {//����closeҲ����io�쳣����ʹ��try-catch���׳��쳣
					fos.close();//����fos���ղ���try��Ķ���fos����Ҫ������try����
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
	}
}

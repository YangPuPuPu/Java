package API;

import java.util.Arrays;

public class ArrayDemo {
/*
 *  Arrays ��������ڲ�������ĸ��ַ���
 *  
 *  public static String toString(int[] a),����ָ����������ݵ��ַ�����ʾ��ʽ
 *  public static String void sort(int [] a),��������˳������ָ��������
 */
	public static void main(String[] args) {
		//����һ������
		int[] arr = {24,69,80,57,13};
		System.out.println("����ǰ"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("�����"+Arrays.toString(arr));
	}
}

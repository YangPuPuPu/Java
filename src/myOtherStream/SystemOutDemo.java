package myOtherStream;

import java.io.PrintStream;

//public static final PrintStream out
//����׼��������� �����Ѿ��򿪲�׼���ý���������ݡ� ͨ����������Ӧ����ʾ������������������û�ָ������һ�����Ŀ�ꡣ 
public class SystemOutDemo {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		ps.print("hello");
		ps.println(100);
		System.out.println(100);
		//System.out���൱��ps����
	}
}

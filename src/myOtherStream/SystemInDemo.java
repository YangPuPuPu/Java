package myOtherStream;
//public static final InputStream in
//“标准”输入流。 该流已经打开，准备提供输入数据。 通常，该流对应于键盘输入或由主机环境或用户指定的另一个输入源。 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("请输入一个字符串：");
		String line  = br.readLine();
		System.out.println("你输入的字符串是："+line);
		
		System.out.println("请输入一个整数：");
		int  i = Integer.parseInt(br.readLine());
		System.out.println("你输入的整数是："+i);
	}
}

package myOtherStream;

import java.io.PrintStream;

//public static final PrintStream out
//“标准”输出流。 此流已经打开并准备好接受输出数据。 通常，此流对应于显示输出或由主机环境或用户指定的另一个输出目标。 
public class SystemOutDemo {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		ps.print("hello");
		ps.println(100);
		System.out.println(100);
		//System.out就相当于ps对象
	}
}

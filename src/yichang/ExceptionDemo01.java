package yichang;
/*
 * 	try{
 * 		可能出现的异常代码
 * }catch(异常类名 变量名){
 * 		异常的处理代码
 * }
 * 
 * public String getMessage();返回此throwable的详细消息字符串
 * public String toString();返回此可抛出的简短描述
 * public void printStackTrace();把异常的错误信息输出在控制台
 */
public class ExceptionDemo01 {
	public static void main(String[] args) {
		System.out.println("开始");
		method();
		System.out.println("结束");
	}
	public static void method() {
		try {
			int[] arr= {1,2,3};
			System.out.println(arr[3]);//ArrayIndexOutOfBoundsException();
		}catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			
			//public String getMessage();返回此throwable的详细消息字符串
			System.out.println(e.getMessage());//Index 3 out of bounds for length 3
			
			//public String toString();返回此可抛出的简短描述
			System.out.println(e.toString());//java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
			
			//public void printStackTrace();把异常的错误信息输出在控制台
			e.printStackTrace();
		}
	}
}

package API;
/*
 *  构造方法：
 *  	public Integer(int value);根据int值创建Integer对象（过时）
 *  	public Integer(String s);根据String值创建Integer对象（过时）
 *  
 *  静态方法获取对象：
 *  	public static Integer valueOf(int i);返回表示指定的int值的Integer实例
 *  	public static Integer valueOf(String s);返回一个保存指定值的Integer对象String
 */
public class IntegerDemo2 {
	public static void main(String[] args) {
		//public Integer(int value);根据int值创建Integer对象（过时）
		Integer i = new Integer(100);
		System.out.println(i);
		
		//public Integer(String s);根据String值穿件Integer对象（过时）
		Integer i1 = new Integer("100");
		//Integer i1 = new Integer("abc");//(NumberFormatException.java:68)他只能解析数字字符串
		System.out.println(i1);
		
		//public static Integer valueOf(int i);返回表示指定的int值的Integer实例
		Integer i2 =Integer.valueOf(100);
		System.out.println(i2);
		
		//public static Integer valueOf(String s);返回一个保存指定值的Integer对象String
		Integer i3 =Integer.valueOf("100");
		System.out.println(i3);
	}
}

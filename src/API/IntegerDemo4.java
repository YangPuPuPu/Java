package API;
/*
 *   装箱：把基本数据类型转换为对应的包装类类型
 *   拆箱：把包装类类型转换为对应的基本数据类型
 */
public class IntegerDemo4 {
	public static void main(String[] args) {
		Integer i = Integer.valueOf(100);
		Integer ii =100;
		
		ii= ii.intValue()+200;
		ii+=200;
		System.out.println(ii);
		Integer iii = null;
		if(iii!=null)
			iii+=300;//NullPointerException空指针
		
	}
}

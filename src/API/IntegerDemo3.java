package API;
/*
 * int和String相互转化
 */
public class IntegerDemo3 {
	public static void main(String[] args) {
		//int----String
		int num = 100;
		//方式1
		String s1 = ""+num;
		System.out.println(s1);
		//方式2
		String s2 = String.valueOf(num);
		System.out.println(s2);
		System.out.println("----------");
		
		//String---int
		String s = "100";
		//方式1
		//String---Integer---int
		Integer i = Integer.valueOf(s);
		//public int intValue();//这个可以将Integer对象转化为int
		int x = i.intValue();
		System.out.println(x);
		//方式2
		//public static int parseInt(String s)
		int y = Integer.parseInt(s);
		System.out.println(y);
	}
}

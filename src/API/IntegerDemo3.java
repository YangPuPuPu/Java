package API;
/*
 * int��String�໥ת��
 */
public class IntegerDemo3 {
	public static void main(String[] args) {
		//int----String
		int num = 100;
		//��ʽ1
		String s1 = ""+num;
		System.out.println(s1);
		//��ʽ2
		String s2 = String.valueOf(num);
		System.out.println(s2);
		System.out.println("----------");
		
		//String---int
		String s = "100";
		//��ʽ1
		//String---Integer---int
		Integer i = Integer.valueOf(s);
		//public int intValue();//������Խ�Integer����ת��Ϊint
		int x = i.intValue();
		System.out.println(x);
		//��ʽ2
		//public static int parseInt(String s)
		int y = Integer.parseInt(s);
		System.out.println(y);
	}
}

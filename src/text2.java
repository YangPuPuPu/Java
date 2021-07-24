public class text2{
	public static void main(String[] args) {
		int a=1,b=2;
		int c = a+b;
		double d=12.12;
		System.out.println(c);
		System.out.println(c+c);
		System.out.println(d+c);
		System.out.println(c+d);
		//在数值类型中+操作表示数值相加
		//并且加操作中有多种数值类型时，会自动进行提升至最高的类型
		//byte,short,char->int>long>float->double
		System.out.println("abc"+c);
		System.out.println(c+"abcd");
		System.out.println("abc"+"123");
		System.out.println("abc"+666);
		//在字符串类型之间或者字符串与其他类型进行加操作时，进行的是字符串连接符，不是算数运算。
		//其中字符串和赋值过的变量进行加运算时，是将字符串和变量的数值进行连接，而不是变量名。
		//字符串和数值相加时，则是字符串和数字进行连接。  
		System.out.println(a>b);//boolean
		System.out.println(c=1);//先赋值再输出
		//在输出语句中用关系运算符时，输出的是布尔数值即true或者false。
		//在输出语句中使用赋值运算时，是先赋值再输出。 
		System.out.println((a>b)&&(c>b));
		//再使用逻辑运算符时输出为布尔类型，并且&&运算若前者为假则后一个式子不会运算。
	}
}

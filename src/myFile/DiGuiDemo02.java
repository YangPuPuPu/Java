package myFile;
/*
 * 递归求阶乘
 * 递归出口：1！=1;
 * 递归规则：n！=n*(n-1)!
 */
public class DiGuiDemo02 {
	public static void main(String[] args) {
		System.out.println(jc(6));
	}
	//定义方法求阶乘
	public static int jc(int n ) {
		if(n==1)
			return 1;
		return n*jc(n-1);
	}
}

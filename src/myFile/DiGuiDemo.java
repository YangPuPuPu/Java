package myFile;
/*
 * �õݹ�ʵ��쳲���������:1,1,2,3,5,8,13,21
 */
public class DiGuiDemo {
	public static void main(String[] args) {
		System.out.println(f(20));
	}

/*
 * �ݹ�ʵ��һ������
 * f(n)��ʾ��n����
 * f(n-1)��ʾ��n-1����
 * f(n-2)��ʾ��n-2����
 * 
 * StackOverflowError:����ջ�������ʱ�׳�һ��Ӧ�ó���ݹ�̫�(û�г���) 
 */
public static int f(int n) {
	if(n==1||n==2)
		return 1;
	return f(n-1)+f(n-2);
	}
}
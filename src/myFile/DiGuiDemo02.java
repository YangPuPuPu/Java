package myFile;
/*
 * �ݹ���׳�
 * �ݹ���ڣ�1��=1;
 * �ݹ����n��=n*(n-1)!
 */
public class DiGuiDemo02 {
	public static void main(String[] args) {
		System.out.println(jc(6));
	}
	//���巽����׳�
	public static int jc(int n ) {
		if(n==1)
			return 1;
		return n*jc(n-1);
	}
}

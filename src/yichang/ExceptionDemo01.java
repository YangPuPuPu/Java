package yichang;
/*
 * 	try{
 * 		���ܳ��ֵ��쳣����
 * }catch(�쳣���� ������){
 * 		�쳣�Ĵ������
 * }
 * 
 * public String getMessage();���ش�throwable����ϸ��Ϣ�ַ���
 * public String toString();���ش˿��׳��ļ������
 * public void printStackTrace();���쳣�Ĵ�����Ϣ����ڿ���̨
 */
public class ExceptionDemo01 {
	public static void main(String[] args) {
		System.out.println("��ʼ");
		method();
		System.out.println("����");
	}
	public static void method() {
		try {
			int[] arr= {1,2,3};
			System.out.println(arr[3]);//ArrayIndexOutOfBoundsException();
		}catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			
			//public String getMessage();���ش�throwable����ϸ��Ϣ�ַ���
			System.out.println(e.getMessage());//Index 3 out of bounds for length 3
			
			//public String toString();���ش˿��׳��ļ������
			System.out.println(e.toString());//java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
			
			//public void printStackTrace();���쳣�Ĵ�����Ϣ����ڿ���̨
			e.printStackTrace();
		}
	}
}

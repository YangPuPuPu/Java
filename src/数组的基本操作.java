
public class ����Ļ������� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
	//���鶨���ʽ
		//��ʽһ��int[] arr:��ʾ������һ��int���͵����飬��������arr
		//��ʽ����int arr[]:��ʾ������һ��int���͵ı�������������arr���顣
		//ͨ��ʹ�õ�һ�ֽ϶ࡣ
	//����Ķ�̬��ʼ��
	   //��������[] ������=new ��������[���鳤��];
		int[] arr=new int[3];
	   //����new��ʾΪ��������ռ䡣ע��****����̬�ڴ��ʼ��Ĭ��ֵ����������������0;����:false;�ַ������ַ������õ��������ͣ������͡�  
	//����ľ�̬��ʼ��
		int[] arr0=new int[] {1,2,3};
		//Ҳ���Լ�Ϊ int[] arr0={1,2,3};
	//�������ָ����ͬ
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		int[] arr1=arr;
		System.out.println(arr[0]);
		arr1[0]=110;
		System.out.println(arr);
		System.out.println(arr[0]);
	//��ȡ���鳤��arr.length;
		System.out.println(arr.length);
	}

}

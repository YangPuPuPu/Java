public class text2{
	public static void main(String[] args) {
		int a=1,b=2;
		int c = a+b;
		double d=12.12;
		System.out.println(c);
		System.out.println(c+c);
		System.out.println(d+c);
		System.out.println(c+d);
		//����ֵ������+������ʾ��ֵ���
		//���ҼӲ������ж�����ֵ����ʱ�����Զ�������������ߵ�����
		//byte,short,char->int>long>float->double
		System.out.println("abc"+c);
		System.out.println(c+"abcd");
		System.out.println("abc"+"123");
		System.out.println("abc"+666);
		//���ַ�������֮������ַ������������ͽ��мӲ���ʱ�����е����ַ������ӷ��������������㡣
		//�����ַ����͸�ֵ���ı������м�����ʱ���ǽ��ַ����ͱ�������ֵ�������ӣ������Ǳ�������
		//�ַ�������ֵ���ʱ�������ַ��������ֽ������ӡ�  
		System.out.println(a>b);//boolean
		System.out.println(c=1);//�ȸ�ֵ�����
		//�����������ù�ϵ�����ʱ��������ǲ�����ֵ��true����false��
		//����������ʹ�ø�ֵ����ʱ�����ȸ�ֵ������� 
		System.out.println((a>b)&&(c>b));
		//��ʹ���߼������ʱ���Ϊ�������ͣ�����&&������ǰ��Ϊ�����һ��ʽ�Ӳ������㡣
	}
}

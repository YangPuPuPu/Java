package set;
/*
 * 	��ϣֵ��
 * 		��jdk���ݶ���ĵ�ַ�����ַ��������������������ֵ
 * 	Object������һ���������Ի�ȡ����Ĺ�ϣֵ
 * 		public int hashCode(),���ض���Ĺ�ϣ��ֵ
 */
public class HashDemo {
	public static void main(String[] args) {
		//����ѧ������
		Student s1= new Student("��С�",19);
		
		//��ͬһ�������ε���hashCode()�������صĹ�ϣֵ����ͬ��
		System.out.println(s1.hashCode());//971848845
		System.out.println(s1.hashCode());//971848845
		System.out.println("------------");
		
		Student s2 = new Student("��С�",19);
		
		//Ĭ������£���ͬ����Ĺ�ϣֵ�ǲ���ͬ��
		//ͨ��������д������ʵ�ֲ�ͬ����Ĺ�ϣֵ����ͬ��
		System.out.println(s2.hashCode());//1910163204
		System.out.println("----------");
		
		System.out.println("hello".hashCode());//99162322
		System.out.println("world".hashCode());//113318802
		System.out.println("java".hashCode());//3254818
		
		System.out.println("world".hashCode());//113318802
		System.out.println("------------");
		
		System.out.println("�ص�".hashCode());//1179395
		System.out.println("ͨ��".hashCode());//1179395
	}
}

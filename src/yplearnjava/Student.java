package yplearnjava;
//ѧ����
public class Student {
	//��Ա����
	//��private���εĳ�Աֻ���ڱ����в��ܷ��ʣ�
	//��װ�����һЩ��Ϣ���������ڲ�����߰�ȫ�Ժʹ��븴���ԡ�
	private String name;
	private int age;
	//��Ա����
	//get/set�������ֱ�������ȡ�����ó�Ա������ֵ��
	/*
	 * this���εı�������ָ����Ա����
	 * ���βκͳ�Ա����ͬ��ʱ������this���εı���ָ�����βΣ������ǳ�Ա����
	 * ����ͬ��ʱ������this�ľ��ǳ�Ա����
	 * ���������ĸ�������ã�this�ʹ����ĸ�����
	 * ���磺s1.name --this.name
	 * 		s2.name--this.name
	 */
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void show() {
		System.out.println(name+","+age);
	}
	/*
	 * ���췽����
	 * 		���ã���������*********���ܣ���ɶ������ݵĳ�ʼ����
	 * 		��ʽ�����η� ������������{
	 * 			}
	 * 		���η�һ����public
	 */
	//�����⼸�ֹ��췽����������
	public Student() {//������û�й��췽��ʱ��Student s=new Student();Ĭ�ϵĹ��췽��
	}
	public Student(int age) {
		this.age=age;
	}
	public Student(String name) {
		this.name=name;
	}
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
}

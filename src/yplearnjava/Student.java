package yplearnjava;
//学生类
public class Student {
	//成员变量
	//被private修饰的成员只能在本类中才能访问；
	//封装将类的一些信息隐藏在类内部，提高安全性和代码复用性。
	private String name;
	private int age;
	//成员方法
	//get/set方法，分别用来获取和设置成员变量的值；
	/*
	 * this修饰的变量用于指代成员变量
	 * 当形参和成员变量同名时，不带this修饰的变量指的是形参，而不是成员变量
	 * 当不同名时，不带this的就是成员变量
	 * 当方法被哪个对象调用，this就代表哪个对象
	 * 例如：s1.name --this.name
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
	 * 构造方法：
	 * 		作用：创建对象；*********功能：完成对象数据的初始化。
	 * 		格式：修饰符 类名（参数）{
	 * 			}
	 * 		修饰符一般是public
	 */
	//以下这几种构造方法都是重载
	public Student() {//这种是没有构造方法时，Student s=new Student();默认的构造方法
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

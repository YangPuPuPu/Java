package jicheng;

public class Teacher extends People{
	public Teacher() {
		
	}
	public Teacher(String name,int age) {
		//this.age=age;
		//this.name=name
		//这都是错误的age和name进行封装
		super(name,age);//使用调用父类的带参构造方法
	}
	
	public void teach() {
		System.out.println("教书育人");
	}
}

package jicheng;
/*
 * »À¿‡
 */
public class People {
	private String name;
	private int age;
	
	public People() {
	}
	
	public People(String name,int age) {
		this.age=age;
		this.name=name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
}

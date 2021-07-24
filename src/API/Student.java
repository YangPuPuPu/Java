package API;

public class Student {
	private String name;
	private int age;
	
	public Student() {
		
	}
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
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
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	@Override
	public boolean equals(Object obj) {//Object obj =Student s;向上转型
		/*
		 * this---s1
		 * obj---s
		 */
		//比较地址是否相同，如果相同，直接返回true
		if (this == obj)
			return true;
		//判断参数是否为null
		//判断两个对象是否来自同一个类
		if (obj == null)
			return false;
		//向下转型
		if (getClass() != obj.getClass())
			return false;
		//比较年龄是否相等
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		//比较姓名内容是否相等
		if (name == null) {
			if (other.name != null)
				return false;
			//这里用到字符串的equals方法是 比较内容的
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}

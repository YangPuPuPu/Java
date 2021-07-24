package set;
/*
 * 学生类
 */
public class Student implements Comparable<Student>{
	private String name;
	private int Age;
	public Student(String name, int age) {
		super();
		this.name = name;
		Age = age;
	}
	public Student() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", Age=" + Age + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Age != other.Age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
		public int compareTo(Student s) {
			// TODO 自动生成的方法存根
//			return 0;//0表示和和前面年龄一样就不存储
//			return 1;//1表示按照输入顺序存储
//			return -1;//表示逆序存储
			//按照年龄从小到大排序
			int num = this.Age-s.Age;
//			//年龄相同时，按照姓名字母顺序排序
			int num2= num==0?this.name.compareTo(s.name):num;
			return num2;
		}
}

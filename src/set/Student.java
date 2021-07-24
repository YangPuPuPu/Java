package set;
/*
 * ѧ����
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
			// TODO �Զ����ɵķ������
//			return 0;//0��ʾ�ͺ�ǰ������һ���Ͳ��洢
//			return 1;//1��ʾ��������˳��洢
//			return -1;//��ʾ����洢
			//���������С��������
			int num = this.Age-s.Age;
//			//������ͬʱ������������ĸ˳������
			int num2= num==0?this.name.compareTo(s.name):num;
			return num2;
		}
}

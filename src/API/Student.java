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
	public boolean equals(Object obj) {//Object obj =Student s;����ת��
		/*
		 * this---s1
		 * obj---s
		 */
		//�Ƚϵ�ַ�Ƿ���ͬ�������ͬ��ֱ�ӷ���true
		if (this == obj)
			return true;
		//�жϲ����Ƿ�Ϊnull
		//�ж����������Ƿ�����ͬһ����
		if (obj == null)
			return false;
		//����ת��
		if (getClass() != obj.getClass())
			return false;
		//�Ƚ������Ƿ����
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		//�Ƚ����������Ƿ����
		if (name == null) {
			if (other.name != null)
				return false;
			//�����õ��ַ�����equals������ �Ƚ����ݵ�
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}

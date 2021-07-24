package yplearnjava;
/*
 * Ñ§Éú²âÊÔÀà
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Ñîè±");
		s.setAge(19);
		s.show();
		System.out.println(s.getName()+"-----"+s.getAge());
		Student s1=new Student("Ñîè±");
		s1.show();
		Student s2=new Student(19);
		s2.show();
		Student s3=new Student("Ñîè±",19);
		s3.show();
		Student s4=new Student();
		s4.show();
	}
}

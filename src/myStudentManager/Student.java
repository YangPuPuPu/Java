package myStudentManager;
/*
 * ѧ����
 */
public class Student {
	//ѧ��
	private String sid;
	//����
	private String name;
	//����
	private String age;
	//��ס��
	private String address;
	
	public Student() {};
	
	public Student(String sid,String name,String age,String address){
		this.sid=sid;
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	public String getSid() {
		return this.sid;
	}
	public void setSid(String sid) {
		this.sid=sid;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getAge() {
		return this.age;
	}
	public void setAge(String age) {
		this.age=age;
	}
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
}

package jicheng;
/*
 * 测试类
 */
public class peopleDemo {
	public static void main(String[] args) {
		//创建老师类并进行测试
		Teacher t=new Teacher();
		t.setAge(20);
		t.setName("璞");
		System.out.println(t.getName()+","+t.getAge());
		t.teach();
		Teacher t1=new Teacher("璞",19);
		System.out.println(t1.getName()+","+t1.getAge());
		t1.teach();
	}
}

package jicheng;
/*
 * ������
 */
public class peopleDemo {
	public static void main(String[] args) {
		//������ʦ�ಢ���в���
		Teacher t=new Teacher();
		t.setAge(20);
		t.setName("�");
		System.out.println(t.getName()+","+t.getAge());
		t.teach();
		Teacher t1=new Teacher("�",19);
		System.out.println(t1.getName()+","+t1.getAge());
		t1.teach();
	}
}

package API;
//public boolean equals(Object anObject);
public class ObjectDemo {
	public static void main(String[] args) {
		Student s= new Student();
		s.setName("����ϼ");
		s.setAge(18);
		System.out.println(s.toString());//û����дʱ������ǵ�ֵַ
		
		Student s1=new Student();
		s1.setName("����ϼ");
		s1.setAge(18);
		System.out.println(s1==s);
		System.out.println(s1.equals(s));
		/* public boolean equals(Object obj) {//����Ҫ��д�������
        		return (this == obj);
        */
    }
}

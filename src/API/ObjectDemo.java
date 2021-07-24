package API;
//public boolean equals(Object anObject);
public class ObjectDemo {
	public static void main(String[] args) {
		Student s= new Student();
		s.setName("林青霞");
		s.setAge(18);
		System.out.println(s.toString());//没有重写时输出的是地址值
		
		Student s1=new Student();
		s1.setName("林青霞");
		s1.setAge(18);
		System.out.println(s1==s);
		System.out.println(s1.equals(s));
		/* public boolean equals(Object obj) {//所以要重写这个方法
        		return (this == obj);
        */
    }
}

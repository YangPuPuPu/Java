package neibulei;
/*
 * ������
 */
public class OuterDemo {
	public static void main(String[] args) {
		//�����ڲ�����󣬲����÷���
//		Inner i = new Inner();//���Ǵ����
//		Outer.Inner oi = new Outer().new Inner();
//		oi.show();
		
		Outer o= new Outer();
		o.method();
		
	}
}

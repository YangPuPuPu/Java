package duotai2;
/*
 * 	����ת��
 * 		�Ӹ�����
 * 		��������ָ�����
 * 
 *  ����ת��(����˶�̬�ı׶ˡ������ܷ���������еĹ��ܣ�
 *  	�Ӹ�����
 *  	��������תΪ�������
 */
public class AnimalDemo {
	public static void main(String[] args) {
		//��̬
		Animal a= new Cat();//����ת��
		a.eat();
//		a.play;
		
		//����ת��
		Cat c = (Cat)a;
		c.eat();
		c.play();
		
		//��̬
		a=new Dog();//����ת��
		a.eat();
		
		//����ת��
		//ClassCastException:����ת���쳣
//		Cat cc=(Cat)a;
//		cc.eat();
//		cc.play();
		
	}
}

package generic;

//public class Generic1{
//
//}

////������Ľ�
//public class Generic1<T>{
//	public void show(T t){
//		System.out.println(t);
//	}
//}

//���ͷ����Ľ�//����Ϊ���͵ķ������������Ƿ�����
public class Generic1{
	public <T> void show(T t) {
		System.out.println(t);
	}
}
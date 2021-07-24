package generic;

//public class Generic1{
//
//}

////泛型类改进
//public class Generic1<T>{
//	public void show(T t){
//		System.out.println(t);
//	}
//}

//泛型方法改进//参数为泛型的方法，但并不是泛型类
public class Generic1{
	public <T> void show(T t) {
		System.out.println(t);
	}
}
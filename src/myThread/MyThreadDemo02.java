package myThread;
/*
 * 	Thread类中获取和设置线程名的方法：
 * 		String getName() 返回此线程的名称。
 * 		void setName(String name) 将此线程的名称更改为等于参数 name 。
 */
public class MyThreadDemo02 {
	public static void main(String[] args) {
//		MyThread02 mt1 = new MyThread02();
//		MyThread02 mt2 = new MyThread02();
//		
//		//void setName(String name) 将此线程的名称更改为等于参数 name
//		mt1.setName("高铁");
//		mt2.setName("飞机");
//		
//		mt1.start();
//		mt2.start();
		
//		//使用带参构造方法（需要在类中定义带参构造方法继承父类的带参构造）
//		MyThread02 mt1 = new MyThread02("高铁");
//		MyThread02 mt2 = new MyThread02("飞机");
//		
//		mt1.start();
//		mt2.start();
		
		//static Thread currentThread​() 返回对当前正在执行的线程对象的引用。  
		System.out.println(Thread.currentThread().getName());
	}
}

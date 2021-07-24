package myThread;
/*
 * 	方式1：继承Thread类
 * 	1.定义一个类继承Thread类
 *	2.重写run方法
 *	3.创建对象
 *	4.启动线程
 */
public class MyThreadDemo {
	public static void main(String[] args) {
		MyThread mt1 =new MyThread();
		MyThread mt2 = new MyThread();

//		mt1.run();
//		mt2.run();
		
		//void start() 导致此线程开始执行; Java虚拟机调用此线程的run方法
		mt1.start();
		mt2.start();
		new MyThread();
	}
}

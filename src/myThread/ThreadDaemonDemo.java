package myThread;
//void setDaemon​(boolean on) 将此线程标记为 daemon线程或用户线程。
//当运行的唯一线程都是守护进程线程时，Java虚拟机将退出
public class ThreadDaemonDemo {
	public static void main(String[] args) {
		ThreadDaemon td1 = new ThreadDaemon();
		ThreadDaemon td2 = new ThreadDaemon();
		
		td1.setName("关羽");
		td2.setName("张飞");
		
		//设置主线程为刘备
		Thread.currentThread().setName("刘备");
		//将两个线程设置成守护线程
		td1.setDaemon(true);
		td2.setDaemon(true);
		
		td1.start();//当主线程结束时，其余守护线程就会结束，但不会马上结束，还会持续一小会
		td2.start();
		
		for(int i = 0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}

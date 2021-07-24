package myThread;
//static void sleep​(long millis) 
//使当前正在执行的线程停留（暂停执行）指定的毫秒数，这取决于系统定时器和调度程序的精度和准确性。
public class ThreadSleep extends Thread{
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for(int i = 0;i<100;i++) {
			System.out.println(getName()+" "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}

package myThread;

public class ThreadPriority extends Thread{
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for(int i = 0;i<100;i++) {
			System.out.println(getName()+" "+i);
		}
	}
}

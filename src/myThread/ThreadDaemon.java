package myThread;
//void setDaemon(boolean on) 将此线程标记为 daemon线程或用户线程。
public class ThreadDaemon extends Thread{
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for(int i=0;i<99;i++) {
			System.out.println(getName()+"  "+i);
		}
	}

}

package myThread;
//void join​() 等待这个线程死亡。  
public class ThreadJoin extends Thread{
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for(int i=0;i<99;i++) {
			System.out.println(getName()+"  "+i);
		}
	}
}

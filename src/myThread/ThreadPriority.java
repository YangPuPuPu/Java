package myThread;

public class ThreadPriority extends Thread{
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		for(int i = 0;i<100;i++) {
			System.out.println(getName()+" "+i);
		}
	}
}

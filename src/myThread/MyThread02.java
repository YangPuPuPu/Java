package myThread;

public class MyThread02 extends Thread{
	public MyThread02() {
	};
	public MyThread02(String name) {
		super(name);
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for(int i=0;i<99;i++) {
			System.out.println(getName()+"  "+i);
		}
	}
}

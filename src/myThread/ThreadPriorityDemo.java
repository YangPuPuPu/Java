package myThread;
/*
 * 	Thread类中获取和设置线程优先级的方法
 * 		int getPriority?() 返回此线程的优先级。
 * 		void setPriority?(int newPriority) 更改此线程的优先级。
 */
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        //创建三个线程
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();

        tp1.setName("飞机");
        tp2.setName("汽车");
        tp3.setName("高铁");

        //查看线程优先级(默认是5)
        System.out.println(tp1.getPriority());
        System.out.println(tp2.getPriority());
        System.out.println(tp3.getPriority());

        //void setPriority?(int newPriority) 更改此线程的优先级。
        //tp1.setPriority(10000);//IllegalArgumentException报错范围应该是0-10
        System.out.println(tp1.MAX_PRIORITY);
        System.out.println(tp1.MIN_PRIORITY);
        System.out.println(tp1.NORM_PRIORITY);

        tp1.setPriority(10);//优先级越高只是越可能得到cpu，不是优先级越高就一定先拿到cpu
        tp2.setPriority(1);
        tp3.setPriority(5);


        tp1.start();
        tp2.start();
        tp3.start();
    }
}

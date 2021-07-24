package jiekouText2;

public class PingpangPlayer extends Player implements SpeakEnglish{
	public PingpangPlayer() {
		
	}
	public PingpangPlayer(String name,int age) {
		super(name,age);
	}
	@Override
	public void eat() {
		// TODO 自动生成的方法存根
		System.out.println("乒乓球运动员吃大白菜，喝小米粥");
	}
	@Override
	public void study() {
		// TODO 自动生成的方法存根
		System.out.println("乒乓球运动员学习发球和接球");
	}
	@Override
	public void speakEnglish() {
		// TODO 自动生成的方法存根
		System.out.println("乒乓球运动员说英语");
	}
}

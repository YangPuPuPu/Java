package jiekouText2;

public class PingpangPlayer extends Player implements SpeakEnglish{
	public PingpangPlayer() {
		
	}
	public PingpangPlayer(String name,int age) {
		super(name,age);
	}
	@Override
	public void eat() {
		// TODO �Զ����ɵķ������
		System.out.println("ƹ�����˶�Ա�Դ�ײˣ���С����");
	}
	@Override
	public void study() {
		// TODO �Զ����ɵķ������
		System.out.println("ƹ�����˶�Աѧϰ����ͽ���");
	}
	@Override
	public void speakEnglish() {
		// TODO �Զ����ɵķ������
		System.out.println("ƹ�����˶�Ա˵Ӣ��");
	}
}

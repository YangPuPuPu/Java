package jiekouText2;

public class PeopleDemo {
	public static void main(String[] args) {
		PingpangPlayer ppp=new PingpangPlayer();
		ppp.setName("��С��");
		ppp.setAge(23);
		System.out.println(ppp.getName()+","+ppp.getAge());
		ppp.eat();
		ppp.study();
		ppp.speakEnglish();
		
		BasketballPlayer bap=new BasketballPlayer("�ƴ�",23);
		System.out.println(bap.getName()+","+bap.getAge());
		bap.study();
		bap.eat();
	}
}

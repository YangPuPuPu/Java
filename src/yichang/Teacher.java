package yichang;

public class Teacher {
	public void checkScore(int score) throws ScoreException {
		if(score<0||score>100) {
//			throw new ScoreException();
			throw new ScoreException("������ĵĳɼ�����Ӧ����0-100֮��");
		}
		else {
			System.out.println("�ɼ�����");
		}
	}
}

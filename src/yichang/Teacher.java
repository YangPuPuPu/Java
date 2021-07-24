package yichang;

public class Teacher {
	public void checkScore(int score) throws ScoreException {
		if(score<0||score>100) {
//			throw new ScoreException();
			throw new ScoreException("你输入的的成绩有误，应该在0-100之间");
		}
		else {
			System.out.println("成绩正常");
		}
	}
}

package yichang;

import java.util.Scanner;

/*
 *测试类
 */
public class TeacherText {
	public static void main(String[] args) throws ScoreException {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入你要输入的分数");
		int score = sc.nextInt();
		
		Teacher t = new Teacher();
		t.checkScore(score);
	}
}

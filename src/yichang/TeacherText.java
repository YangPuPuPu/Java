package yichang;

import java.util.Scanner;

/*
 *������
 */
public class TeacherText {
	public static void main(String[] args) throws ScoreException {
		Scanner sc =new Scanner(System.in);
		System.out.println("��������Ҫ����ķ���");
		int score = sc.nextInt();
		
		Teacher t = new Teacher();
		t.checkScore(score);
	}
}


//����
import java.util.Scanner;
import java.util.Random;

public class Random������Ĳ��� {
	public static void main(String[] argc) {
		// ��������
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		// ��ѭ����ȡʮ���������
		for (int i = 1; i <= 10; i++) {
			// ��ȡ�����������������100��ʾ��ȡ0��99���������������+1����Ա�ʾ1��100���������
			int j = r.nextInt(100) + 1;
			System.out.println("j:" + j);
		}
		int number = r.nextInt(100) + 1;
		// ����Ҫʵ��һ�������ֵ���Ϸ
		while (true) {
			int guessNumber = sc.nextInt();
			if (guessNumber > number)
				System.out.println("��µ�" + guessNumber + "����");
			else if (guessNumber < number)
				System.out.println("��µ�" + guessNumber + "С��");
			else {
				System.out.println("��ϲ�������");
				break;
			}
		}
	}
}


//导包
import java.util.Scanner;
import java.util.Random;

public class Random随机数的产生 {
	public static void main(String[] argc) {
		// 创建对象
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		// 用循环获取十个随机数、
		for (int i = 1; i <= 10; i++) {
			// 获取随机数：其中括号中100表示获取0到99的随机数，而后面+1则可以表示1到100的随机数。
			int j = r.nextInt(100) + 1;
			System.out.println("j:" + j);
		}
		int number = r.nextInt(100) + 1;
		// 下面要实现一个猜数字的游戏
		while (true) {
			int guessNumber = sc.nextInt();
			if (guessNumber > number)
				System.out.println("你猜的" + guessNumber + "大了");
			else if (guessNumber < number)
				System.out.println("你猜的" + guessNumber + "小了");
			else {
				System.out.println("恭喜你猜中了");
				break;
			}
		}
	}
}

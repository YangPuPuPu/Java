import java.util.Scanner;
public class Ë®ÏÉ»¨Êý {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=100;i<=999;i++) {
			int ge=i%10;
			int shi=i/10%10;
			int bai=i/100;
			if(ge*ge*ge+bai*bai*bai+shi*shi*shi==i)
				System.out.println(i);
		}
	}
}

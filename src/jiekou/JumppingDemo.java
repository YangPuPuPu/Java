package jiekou;
/*
 * 测试类
 */
public class JumppingDemo {
	public static void main(String[] args) {
//		Jumpping j=new Jumpping();//这里jumpping也是一个抽象的，不可以实例化
		Jumpping j = new Cat();
		j.jump();
	}
}

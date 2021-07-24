package jiekou;
/*
 * 定义了一个接口
 * 		接口的特点： 1.接口用关键字interface修饰
 * 					public interface 接口名{}
 * 					2.类实现接口用implements表示
 * 					public class 类名 implements 接口名{
 * 					3.接口不能实例化
 * 					接口如何实例化呢？可以参照多态的方式，通过类对象实例化，这叫接口多态
 * 					多态的形式：具体类多态，抽象类多态，接口多态。后两种用的比较多
 * 					多态的前提：有继承或者实现关系，有方法重写，有父（类/接口）引用指向（子/实现）类对象
 * 					4.接口的实现类
 * 					要么重写接口中的所有抽象方法
 * 					要么是抽象类
 */
public interface Jumpping {
	public abstract void jump();
}

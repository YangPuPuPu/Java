package nimingneibulei;
/*
 *  前提：
 *  	存在一个类或者接口
 *  	这里的类可以是具体类也可以是抽象类
 *  
 *  格式：
 *  	new类名或者接口名（）{
 *  		重写方法
 *  };
 *  
 *  本质:
 *  	就是一个继承了该类或者该接口的 子类 匿名对象；
 */
public class Outer {
	public void method() {
		/*
		new Inner() { //这里相当于新建了一个对象这个对象实现了Inner接口
			@Override
			public void show() {
				// TODO 自动生成的方法存根
				System.out.println("匿名内部类");
			}
		};
		*/
		//所以我要调用Inner里面的show方法就使用
		new Inner() { //这里相当于新建了一个对象这个对象实现了Inner接口
			@Override
			public void show() {
				// TODO 自动生成的方法存根
				System.out.println("匿名内部类");
			}
		}.show();//这里就是Inner对象调用show方法
		
		//若我要多次使用
		Inner i = new Inner() {
			public void show() {
				System.out.println("匿名内部类");
			};
		};
		i.show();
		i.show();
	}
}

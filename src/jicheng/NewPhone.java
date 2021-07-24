package jicheng;
/*
 * 新手机
 */
public class NewPhone extends Phone{
	
	//重写call方法
	@Override		//这个是个注解，用于检查重写方法声明的正确性
	public void call(String name) {
		System.out.println("开启视频功能");
//		System.out.println("给"+name+"打电话");
		super.call(name);
	}
	/*
	 * 方法重写注意事项
	 * 	1.私有方法不能被重写(父类私有成员子类是不能继承的)即在父类中用private修饰的成员，在子类中是不能访问的
	 *  2.子类方法访问权限不能更低（public>默认>私有）  即在子类中重写方法时访问权限应该大于等于父类方法
	 */
}

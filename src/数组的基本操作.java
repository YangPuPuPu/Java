
public class 数组的基本操作 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	//数组定义格式
		//格式一：int[] arr:表示定义了一个int类型的数组，数组名是arr
		//格式二：int arr[]:表示定义了一个int类型的变量，变量名是arr数组。
		//通常使用第一种较多。
	//数组的动态初始化
	   //数据类型[] 变量名=new 数据类型[数组长度];
		int[] arr=new int[3];
	   //其中new表示为数组申请空间。注意****：动态内存初始化默认值：整数、浮点数：0;布尔:false;字符：空字符；引用的数据类型：空类型。  
	//数组的静态初始化
		int[] arr0=new int[] {1,2,3};
		//也可以简化为 int[] arr0={1,2,3};
	//多个数组指向相同
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		int[] arr1=arr;
		System.out.println(arr[0]);
		arr1[0]=110;
		System.out.println(arr);
		System.out.println(arr[0]);
	//获取数组长度arr.length;
		System.out.println(arr.length);
	}

}

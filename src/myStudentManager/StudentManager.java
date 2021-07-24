
package myStudentManager;

import java.util.ArrayList;

import java.util.Scanner;

public class StudentManager {
	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();
		while (true) {
			// 输出语句完成主界面的编写
			System.out.println("----------欢迎来到学生管理系统----------");
			System.out.println("1 添加学生");
			System.out.println("2 删除学生");
			System.out.println("3 修改学生");
			System.out.println("4 查看所有学生");
			System.out.println("5 退出");
			System.out.println("请输入你的选择：");

			// 用Scanner实现键盘录入数据；
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();

			// 用switch语句完成操作的选择
			switch (i) {
			case 1:
				// System.out.println("添加学生");
				addStudent(array);
				break;
			case 2:
				// System.out.println("删除学生");
				deleteStudent(array);
				break;
			case 3:
				// System.out.println("修改学生");
				updateStudent(array);
				break;
			case 4:
				// System.out.println("查看所有学生");
				findAllStudent(array);
				break;
			case 5:
				System.out.println("谢谢使用");
				System.exit(0);// JVM退出（Java虚拟机退出）
			}
		}
	}

	// 定义一个方法，用于添加学生信息。
	public static void addStudent(ArrayList<Student> array) {
		// 键盘录入学生对象所需要的数据，显示提示信息，提示要输入何种信息
		Scanner sc = new Scanner(System.in);
		// 为了让sid变量能再循环外使用我们在循环外定义sid
		String sid;
		// 为了让程序能够回到这里，我们使用循环实现
		while (true) {
			System.out.println("请输入学生学号：");
			sid = sc.nextLine();
			boolean flag = isUsed(array, sid);
			if (flag) {
				System.out.println("你输入的学号已经被使用，请重新输入");
			} else {
				break;
			}
		}
		System.out.println("请输入学生姓名：");
		String name = sc.nextLine();
		System.out.println("请输入学生年龄：");
		String age = sc.nextLine();
		System.out.println("请输入学生居住地：");
		String address = sc.nextLine();

		// 创建学生对象，把键盘录入的数据赋值给学生对象的成员变量；
		Student s = new Student(sid, name, age, address);

		// 将学生对象添加到集合中
		array.add(s);

		// 给出添加成功提示;
		System.out.println("添加学生成功");
	}

	// 定义一个方法，用于查看学生信息
	public static void findAllStudent(ArrayList<Student> array) {
		// 判断结婚中是否有数据，如果没有显示提示信息
		if (array.size() == 0) {
			System.out.println("无信息，请添加信息后在查询");
			return;
		}

		// 显示表头信息
		System.out.println("学号\t\t姓名\t年龄\t居住地");

		// 将集合中的数据取出按照对应格式显示学生信息，年龄补充“岁”
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t" + s.getAddress());
		}
	}

	// 定义一个方法用于删除学会信息
	public static void deleteStudent(ArrayList<Student> array) {
		// 键盘录入学生学号，显示提示信息
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入你要删除学生的学号:");
		String sid = sc.nextLine();
		// 定义一个标志，用来判断学号是否存在
		int index = -1;
		// 遍历集合将队形学生从集合中删除
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if (s.getSid().equals(sid)) {
				array.remove(i);
				index = i;
				break;
			}
		}
		// 给出学号不存在的提示
		if (index == -1) {
			System.out.println("该信息不存在，请重新输入");
		}
		// 给出删除学生成功提示
		else {
			System.out.println("删除学生成功");
		}
	}

	// 定义一个方法用于修改学生信息
	public static void updateStudent(ArrayList<Student> array) {
		// 键盘录入要修改学生学号 显示提示信息
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要修改学生的学号:");
		String sid = sc.nextLine();

		// 键盘录入要修改学生的信息
		System.out.println("请输入修改后学生的姓名:");
		String name = sc.nextLine();
		System.out.println("请输入修改后学生的年龄:");
		String age = sc.nextLine();
		System.out.println("请输入修改后学生的居住地:");
		String address = sc.nextLine();

		// 创建学生对象
		Student s = new Student(sid, name, age, address);

		// 定义一个标志，用于判断学号输入是否有误
		int index = -1;

		// 遍历集合修改对应学生的信息
		for (int i = 0; i < array.size(); i++) {
			Student student = array.get(i);
			if (sid.equals(student.getSid())) {
				array.set(i, s);
				index = i;
				break;
			}
		}
		// 给出学号不存在的提示
		if (index == -1) {
			System.out.println("该信息不存在，请重新输入");
		}

		// 给出修改成功提示
		else {
			System.out.println("修改学生成功");
		}
	}

	// 定义一个方法，用于判断学号是否被占用 相同返回true都不同返回false
	public static boolean isUsed(ArrayList<Student> array, String sid) {
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i).getSid().equals(sid)) {
				return true;
			}
		}
		return false;
	}
}

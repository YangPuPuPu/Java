package myCharStream02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 *  需求：键盘录入5个学生信息（姓名，语文成绩，数学成绩，英语成绩）,要求按照成绩总分从高到低写入文本文件
 *  	格式，姓名,语文成绩,数学成绩,英语成绩
 *  
 */
public class TreeSetToTxt {
	public static void main(String[] args) throws IOException{
		TreeSet<Student> tr = new TreeSet<Student>(new Comparator<Student>() {
			public int compare(Student s1,Student s2) {
				int sum = s2.getsum()-s1.getsum();
				int sum2 = sum==0?s1.getChinese()-s2.getChinese():sum;
				int sum3 = sum2==0?s1.getMath()-s2.getMath():sum2;
				int sum4 = sum3==0?s1.getName().compareTo(s2.getName()):sum3;
				return sum4;
			}
		});
		
		//从键盘录入五个学生对象信息并加入treeset集合
		for(int i=0;i<5;i++) {
			System.out.println("请输入第"+(i+1)+"个学生信息");
			System.out.println("姓名：");
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			System.out.println("语文成绩：");
			int chinese  = sc.nextInt();
			System.out.println("数学成绩：");
			int math  = sc.nextInt();
			System.out.println("英语成绩：");
			int english  = sc.nextInt();
			
			//创建一个学生对象
			Student s = new Student();
			s.setName(name);
			s.setChinese(chinese);
			s.setMath(math);
			s.setEnglish(english);
			
			tr.add(s);
			}
		
		//创建字节缓冲输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\develop\\Project\\java.txt"));
		
		for(Student s:tr){
			StringBuilder sb = new StringBuilder();
			sb.append(s.getName()).append(",").append(s.getChinese()).append(",").append(s.getMath()).append(",").append(s.getEnglish()).append(",").append(s.getsum());
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
	}
}

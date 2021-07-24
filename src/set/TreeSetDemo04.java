package set;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * 需求：用TreeSet集合存储多个学生信息，并遍历该集合
 * 要求:按照总分从高到低出现
 */
public class TreeSetDemo04 {
	public static void main(String[] args) {
		TreeSet<Student1> ts = new TreeSet<Student1>(new Comparator<Student1>(){
			public int compare(Student1 s1,Student1 s2) {
				int num = s2.getSum()-s1.getSum();
				int num2 = num==0?s2.getChinese()-s1.getChinese():num;
				int num3 = num2==0?s2.getName().compareTo(s1.getName()):num2;
				return num3;
			}
		});
	
	Student1 s1 = new Student1("林青霞",98,100);
	Student1 s2 = new Student1("张曼玉",95,95);
	Student1 s3 = new Student1("王祖贤",100,93);
	Student1 s4 = new Student1("柳岩",100,97);
	Student1 s5 = new Student1("风清扬",98,98);
	Student1 s6 = new Student1("左冷禅",97,99);
	Student1 s7 = new Student1("赵云",97,99);
	
	ts.add(s1);
	ts.add(s2);
	ts.add(s3);
	ts.add(s4);
	ts.add(s5);
	ts.add(s6);
	ts.add(s7);
	
	for(Student1 s:ts) {
		System.out.println(s.getName()+","+s.getChinese()+","+s.getMath()+","+s.getSum());
	}
	}
}

package myCharStream02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 *  ���󣺼���¼��5��ѧ����Ϣ�����������ĳɼ�����ѧ�ɼ���Ӣ��ɼ���,Ҫ���ճɼ��ִܷӸߵ���д���ı��ļ�
 *  	��ʽ������,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�
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
		
		//�Ӽ���¼�����ѧ��������Ϣ������treeset����
		for(int i=0;i<5;i++) {
			System.out.println("�������"+(i+1)+"��ѧ����Ϣ");
			System.out.println("������");
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			System.out.println("���ĳɼ���");
			int chinese  = sc.nextInt();
			System.out.println("��ѧ�ɼ���");
			int math  = sc.nextInt();
			System.out.println("Ӣ��ɼ���");
			int english  = sc.nextInt();
			
			//����һ��ѧ������
			Student s = new Student();
			s.setName(name);
			s.setChinese(chinese);
			s.setMath(math);
			s.setEnglish(english);
			
			tr.add(s);
			}
		
		//�����ֽڻ������������
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

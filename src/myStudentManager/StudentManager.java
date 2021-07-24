
package myStudentManager;

import java.util.ArrayList;

import java.util.Scanner;

public class StudentManager {
	public static void main(String[] args) {
		ArrayList<Student> array = new ArrayList<Student>();
		while (true) {
			// ���������������ı�д
			System.out.println("----------��ӭ����ѧ������ϵͳ----------");
			System.out.println("1 ���ѧ��");
			System.out.println("2 ɾ��ѧ��");
			System.out.println("3 �޸�ѧ��");
			System.out.println("4 �鿴����ѧ��");
			System.out.println("5 �˳�");
			System.out.println("���������ѡ��");

			// ��Scannerʵ�ּ���¼�����ݣ�
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();

			// ��switch�����ɲ�����ѡ��
			switch (i) {
			case 1:
				// System.out.println("���ѧ��");
				addStudent(array);
				break;
			case 2:
				// System.out.println("ɾ��ѧ��");
				deleteStudent(array);
				break;
			case 3:
				// System.out.println("�޸�ѧ��");
				updateStudent(array);
				break;
			case 4:
				// System.out.println("�鿴����ѧ��");
				findAllStudent(array);
				break;
			case 5:
				System.out.println("ллʹ��");
				System.exit(0);// JVM�˳���Java������˳���
			}
		}
	}

	// ����һ���������������ѧ����Ϣ��
	public static void addStudent(ArrayList<Student> array) {
		// ����¼��ѧ����������Ҫ�����ݣ���ʾ��ʾ��Ϣ����ʾҪ���������Ϣ
		Scanner sc = new Scanner(System.in);
		// Ϊ����sid��������ѭ����ʹ��������ѭ���ⶨ��sid
		String sid;
		// Ϊ���ó����ܹ��ص��������ʹ��ѭ��ʵ��
		while (true) {
			System.out.println("������ѧ��ѧ�ţ�");
			sid = sc.nextLine();
			boolean flag = isUsed(array, sid);
			if (flag) {
				System.out.println("�������ѧ���Ѿ���ʹ�ã�����������");
			} else {
				break;
			}
		}
		System.out.println("������ѧ��������");
		String name = sc.nextLine();
		System.out.println("������ѧ�����䣺");
		String age = sc.nextLine();
		System.out.println("������ѧ����ס�أ�");
		String address = sc.nextLine();

		// ����ѧ�����󣬰Ѽ���¼������ݸ�ֵ��ѧ������ĳ�Ա������
		Student s = new Student(sid, name, age, address);

		// ��ѧ��������ӵ�������
		array.add(s);

		// ������ӳɹ���ʾ;
		System.out.println("���ѧ���ɹ�");
	}

	// ����һ�����������ڲ鿴ѧ����Ϣ
	public static void findAllStudent(ArrayList<Student> array) {
		// �жϽ�����Ƿ������ݣ����û����ʾ��ʾ��Ϣ
		if (array.size() == 0) {
			System.out.println("����Ϣ���������Ϣ���ڲ�ѯ");
			return;
		}

		// ��ʾ��ͷ��Ϣ
		System.out.println("ѧ��\t\t����\t����\t��ס��");

		// �������е�����ȡ�����ն�Ӧ��ʽ��ʾѧ����Ϣ�����䲹�䡰�ꡱ
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "��\t" + s.getAddress());
		}
	}

	// ����һ����������ɾ��ѧ����Ϣ
	public static void deleteStudent(ArrayList<Student> array) {
		// ����¼��ѧ��ѧ�ţ���ʾ��ʾ��Ϣ
		Scanner sc = new Scanner(System.in);

		System.out.println("��������Ҫɾ��ѧ����ѧ��:");
		String sid = sc.nextLine();
		// ����һ����־�������ж�ѧ���Ƿ����
		int index = -1;
		// �������Ͻ�����ѧ���Ӽ�����ɾ��
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			if (s.getSid().equals(sid)) {
				array.remove(i);
				index = i;
				break;
			}
		}
		// ����ѧ�Ų����ڵ���ʾ
		if (index == -1) {
			System.out.println("����Ϣ�����ڣ�����������");
		}
		// ����ɾ��ѧ���ɹ���ʾ
		else {
			System.out.println("ɾ��ѧ���ɹ�");
		}
	}

	// ����һ�����������޸�ѧ����Ϣ
	public static void updateStudent(ArrayList<Student> array) {
		// ����¼��Ҫ�޸�ѧ��ѧ�� ��ʾ��ʾ��Ϣ
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ�޸�ѧ����ѧ��:");
		String sid = sc.nextLine();

		// ����¼��Ҫ�޸�ѧ������Ϣ
		System.out.println("�������޸ĺ�ѧ��������:");
		String name = sc.nextLine();
		System.out.println("�������޸ĺ�ѧ��������:");
		String age = sc.nextLine();
		System.out.println("�������޸ĺ�ѧ���ľ�ס��:");
		String address = sc.nextLine();

		// ����ѧ������
		Student s = new Student(sid, name, age, address);

		// ����һ����־�������ж�ѧ�������Ƿ�����
		int index = -1;

		// ���������޸Ķ�Ӧѧ������Ϣ
		for (int i = 0; i < array.size(); i++) {
			Student student = array.get(i);
			if (sid.equals(student.getSid())) {
				array.set(i, s);
				index = i;
				break;
			}
		}
		// ����ѧ�Ų����ڵ���ʾ
		if (index == -1) {
			System.out.println("����Ϣ�����ڣ�����������");
		}

		// �����޸ĳɹ���ʾ
		else {
			System.out.println("�޸�ѧ���ɹ�");
		}
	}

	// ����һ�������������ж�ѧ���Ƿ�ռ�� ��ͬ����true����ͬ����false
	public static boolean isUsed(ArrayList<Student> array, String sid) {
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i).getSid().equals(sid)) {
				return true;
			}
		}
		return false;
	}
}

package java03.copy;

import java.util.Scanner;

public class TestApp {
//	static int kor1;
//	static int kor2;
//	static int kor3;
//	static int tot;
//	static double avg;

	public static void main(String[] args) {
		Exam[] exams = new Exam[3];
		int current =0;
		int menu = 0;
		boolean flag = true;

		try (Scanner scan = new Scanner(System.in)) {
			while (flag) {
				menu = selectMenu();
				switch (menu) {
				case 1: // ���� �Է�--------
					inputScore(exams,current);

					break;

				case 2: // ���� ���--------
					displayscore(exams,current);

					break;
				case 3:
					flag = false;
					break;

				}

			}
		}
		System.out.println("���α׷��� ���� �մϴ�.");
	}

	private static void displayscore(Exam[] exams, int current) {

		// �������
		int tot = 0;
		double avg = 0.0;

		for (int i = 0; i < 3; i++) {

			
			Exam exam = exams[i];
			int kor =exam.kor;
			int eng =exam.eng;
			int math =exam.math;
			
			tot = kor + eng + math;
			avg = tot / 3;

			System.out.printf(" ����: %d\n",kor);
			System.out.printf(" ���� : %d\n", eng);
			System.out.printf(" ���� : %d\n", math);
			System.out.printf(" ���� : %d\n", tot);
			System.out.printf(" ��� : %6.2f\n", avg);
		}
	}

	private static void inputScore(Exam[] exams,int current) {
		// ���� �Է�

		Scanner scan = new Scanner(System.in);
		
		
		int kor, eng, math;
			do {

				System.out.printf("����  : ");
				kor = scan.nextInt();
				if (kor < 0 || 100 < kor)
					System.out.println("����������(0~100 ������ϴ�");
			} while (kor < 0 || 100 < kor);

			do {

				System.out.printf("����  : ");
				eng = scan.nextInt();
				if (eng < 0 || 100 < eng)
					System.out.println("����������(0~100 ������ϴ�");
			} while (eng < 0 || 100 < eng);

			do {

				System.out.printf("����  : ");
				math = scan.nextInt();
				if (math < 0 || 100 < math)
					System.out.println("����������(0~100 ������ϴ�");
			} while (math < 0 || 100 < math);

			Exam exam = new Exam();
			exam.kor = kor;
			exam.eng = eng;
			exam.math = math;

			exams[current] = exam;
			current++;

	}

	private static int selectMenu() {

		// �޴�����--------
		Scanner scan = new Scanner(System.in);
		int menu;
		System.out.println("�޴� ����");
		System.out.println("1.�����Է�");
		System.out.println("2.�������");
		System.out.println("3.����");
		System.out.println("����>>");

		menu = scan.nextInt();
		return menu;

	}

}

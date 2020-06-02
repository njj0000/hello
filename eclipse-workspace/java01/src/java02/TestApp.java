package java02;

import java.util.Scanner;

public class TestApp {
//	static int kor1;
//	static int kor2;
//	static int kor3;
//	static int tot;
//	static double avg;

	public static void main(String[] args) {
		int[] kors = new int[3];
		int menu = 0;
		boolean flag = true;

		try (Scanner scan = new Scanner(System.in)) {
			while (flag) {
				menu = selectMenu();
				switch (menu) {
				case 1: // ���� �Է�--------
					inputScore(kors);

					break;

				case 2: // ���� ���--------
					displayscore(kors);

					break;
				case 3:
					flag = false;
					break;

				}

			}
		}
		System.out.println("���α׷��� ���� �մϴ�.");
	}

	private static void displayscore(int[] kors) {

		// �������
		int tot = 0;
		double avg = 0.0;
		for (int i = 0; i < 3; i++)

			tot += kors[i];
		avg = tot / 3;

		for (int i = 0; i < 3; i++)
			System.out.printf(" ����%d : %d\n", i + 1, kors[i]);
		System.out.printf(" ���� : %d\n", tot);
		System.out.printf(" ��� : %6.2f\n", avg);

	}

	private static void inputScore(int[] kors) {
		// ���� ���

		Scanner scan = new Scanner(System.in);
		int kor = 0;
		int i;
		for (int i1 = 0; i1 < 3; i1++) {
			do {

				System.out.printf("����%d  : ", i1 + 1);
				kors[0] = scan.nextInt();
				if (kor < 0 || 100 < kor)
					System.out.println("����������(0~100 ������ϴ�");
			} while (kor < 0 || 100 < kor);
		kors[i1] = kor;
		
	}
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

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
				case 1: // 성적 입력--------
					inputScore(kors);

					break;

				case 2: // 성적 출력--------
					displayscore(kors);

					break;
				case 3:
					flag = false;
					break;

				}

			}
		}
		System.out.println("프로그램을 종료 합니다.");
	}

	private static void displayscore(int[] kors) {

		// 성적출력
		int tot = 0;
		double avg = 0.0;
		for (int i = 0; i < 3; i++)

			tot += kors[i];
		avg = tot / 3;

		for (int i = 0; i < 3; i++)
			System.out.printf(" 국어%d : %d\n", i + 1, kors[i]);
		System.out.printf(" 총점 : %d\n", tot);
		System.out.printf(" 평균 : %6.2f\n", avg);

	}

	private static void inputScore(int[] kors) {
		// 성적 출력

		Scanner scan = new Scanner(System.in);
		int kor = 0;
		int i;
		for (int i1 = 0; i1 < 3; i1++) {
			do {

				System.out.printf("국어%d  : ", i1 + 1);
				kors[0] = scan.nextInt();
				if (kor < 0 || 100 < kor)
					System.out.println("성적범위를(0~100 벗어났습니다");
			} while (kor < 0 || 100 < kor);
		kors[i1] = kor;
		
	}
}
	private static int selectMenu() {

		// 메뉴선택--------
		Scanner scan = new Scanner(System.in);
		int menu;
		System.out.println("메뉴 선택");
		System.out.println("1.성적입력");
		System.out.println("2.성적출력");
		System.out.println("3.종료");
		System.out.println("선택>>");

		menu = scan.nextInt();
		return menu;

	}

}

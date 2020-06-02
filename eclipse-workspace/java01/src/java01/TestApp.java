package java01;

import java.util.Scanner;

public class TestApp {

	public static void main(String[] args) {
		int kor1;
		int kor2;
		int kor3;
		int tot;
		boolean flag = true;
		double avg;

		kor1 = 0;
		kor2 = 0;
		kor3 = 0;

		try (Scanner scan = new Scanner(System.in)) {
			while (flag) {
				
			selectMenu();
				//메뉴선택--------
				int menu;
				System.out.println("메뉴 선택");
				System.out.println("1.성적입력");
				System.out.println("2.성적출력");
				System.out.println("3.종료");
				System.out.println("선택>>");

				menu = scan.nextInt();

				switch (menu) {
				case 1: // 성적 입력--------

					do {

						System.out.print("국어 1 : ");
						kor1 = scan.nextInt();
						if (kor1 < 0 || 100 < kor1)
							System.out.println("성적범위를(0~100 벗어났습니다");
					} while (kor1 < 0 || 100 < kor1);

					do {

						System.out.print("국어 2 : ");
						kor1 = scan.nextInt();
						if (kor2 < 0 || 100 < kor2)
							System.out.println("성적범위를(0~100 벗어났습니다");
					} while (kor3 < 0 || 100 < kor3);

					do {

						System.out.print("국어 3 : ");
						kor1 = scan.nextInt();
						if (kor3 < 0 || 100 < kor3)
							System.out.println("성적범위를(0~100 벗어났습니다");
					} while (kor3 < 0 || 100 < kor3);
					break;

				case 2: // 성적 출력--------
					tot = kor1 + kor2 + kor3;
					avg = tot / 3;

					for (int i = 0; i < 3; i++)
						System.out.printf(" 국어%d : %d\n", i + 1, kor1);
					System.out.printf(" 총점 : %d\n", tot);
					System.out.printf(" 평균 : %6.2f\n", avg);
					break;
				case 3: 
					flag = false;
					break;

				}

			}
		}System.out.println("프로그램을 종료 합니다.");
	}

	private static void selectMenu() {
		// TODO Auto-generated method stub
		
	}

}

package com.kita.first;
import java.util.Scanner;
public class GreatMission2_1 {
	/* 자판기 게임 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] menuArr = { "사이다", "콜라", "환타", "마운틴듀", "초코우유", "바나나우유" };
		int[] priceArr = { 500, 600, 700, 800, 400, 400 };
		int sum = 0;

		System.out.println("-메뉴-");
		for(int i=0; i<menuArr.length; i++) {
			System.out.printf("%d. %s %d원\n", i+1, menuArr[i], priceArr[i]);
		}

		while(true) {
			System.out.print("메뉴를 입력하시오: (0은 종료)");
			int num = scan.nextInt();
			int index = num-1;
			if(num==0) {
				break;
			} else if(num<0 || num>menuArr.length) {
				System.out.print("범위 내의 숫자를 입력하세요.\n");
				continue;
			}
			sum += priceArr[index];
			System.out.printf("%s %d원\n", menuArr[index], priceArr[index]);
		}

		scan.close();
		System.out.printf("종료! %d원 사용", sum);


	}
}

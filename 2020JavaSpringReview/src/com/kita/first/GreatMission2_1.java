package com.kita.first;
import java.util.Scanner;
public class GreatMission2_1 {
	/* ���Ǳ� ���� */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] menuArr = { "���̴�", "�ݶ�", "ȯŸ", "����ƾ��", "���ڿ���", "�ٳ�������" };
		int[] priceArr = { 500, 600, 700, 800, 400, 400 };
		int sum = 0;

		System.out.println("-�޴�-");
		for(int i=0; i<menuArr.length; i++) {
			System.out.printf("%d. %s %d��\n", i+1, menuArr[i], priceArr[i]);
		}

		while(true) {
			System.out.print("�޴��� �Է��Ͻÿ�: (0�� ����)");
			int num = scan.nextInt();
			int index = num-1;
			if(num==0) {
				break;
			} else if(num<0 || num>menuArr.length) {
				System.out.print("���� ���� ���ڸ� �Է��ϼ���.\n");
				continue;
			}
			sum += priceArr[index];
			System.out.printf("%s %d��\n", menuArr[index], priceArr[index]);
		}

		scan.close();
		System.out.printf("����! %d�� ���", sum);


	}
}

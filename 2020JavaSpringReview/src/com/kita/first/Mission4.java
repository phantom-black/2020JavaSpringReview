package com.kita.first;

import java.util.Scanner;

public class Mission4 {
	/*
	  switch�� �ذ�
	    ���� �Է��� �ּ��� : (1~12)
	  
	  3~5�� �Է��ߴٸ� "���Դϴ�."
	  6~8�� �Է��ߴٸ� "�����Դϴ�."
	  9~11�� �Է��ߴٸ� "�����Դϴ�."
	  1, 2, 12�� �Է��ߴٸ� "�ܿ��Դϴ�."
	  1~12�� �ƴ� ���� �Է��ߴٸ� "�߸� �Է��ϼ̽��ϴ�."
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է��� �ּ��� : (1~12)");
		
		String month = scan.next();
		scan.close();
		
		switch(month) {
		
			case "3": case "4": case "5":
				System.out.println("���Դϴ�.");
				break;
				
			case "6": case "7": case "8":
				System.out.println("�����Դϴ�.");
				break;
			
			case "9": case "10": case "11":
				System.out.println("�����Դϴ�.");
				break;
			
			case "1": case "2": case "12":
				System.out.println("�ܿ��Դϴ�.");
				break;
			
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
				
		}
	}
}

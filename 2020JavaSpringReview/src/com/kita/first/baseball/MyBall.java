package com.kita.first.baseball;

import java.util.Scanner;

public class MyBall {
	private int[] myArr;
	private Scanner scan;
	
	public MyBall(int n) {
		init(n);
	}
	
	private void init(int n) {
		myArr = new int[n];
		scan = new Scanner(System.in);
	}
	
	public void setNumbers() {
		for(int i=0; i<myArr.length; i++) {
			System.out.printf("����%d: ", i+1);
			String val = scan.nextLine();
			
			try {
				myArr[i] = Integer.parseInt(val);
			} catch(Exception e) {
				i--;
				System.out.println("���ڸ� �Է��ϼ���");
				continue;
			}
			
			if(myArr[i]<1 || myArr[i]>9) {
				System.out.println("1~9���� �Է��ϼ���");
				continue;
			}
			
			for(int z=0; z<i; z++) {
				if(myArr[i]==myArr[z]) {
					i--;
					System.out.println("�ߺ��� ���� �����մϴ�.");
					break;
				}
			}
		}
	}
	
	public int get(int idx) {
		return myArr[idx];
	}
}

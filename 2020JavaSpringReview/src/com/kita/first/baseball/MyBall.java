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
	
	public void SetNumbers() {
		for(int i=0; i<myArr.length; i++) {
			System.out.printf("숫자%d: ", i+1);
			String val = scan.nextLine();
			
			try {
				myArr[i] = Integer.parseInt(val);
			} catch(Exception e) {
				System.out.println("숫자만 입력하세요");
			}
		}
	}
}

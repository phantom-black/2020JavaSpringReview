package com.kita.second;

public class Gugudan {
	public static void main(String[] args) {
		gugudan(2, 5);
		
		int sum = sum(1,2); //3
		sum = sum(1,2,3); //6
		sum = sum(1,2,3,4,5,6,7,8,9,10,11,12);
		int result = Utils.parseStringToInt("10", 0);//10정수값 리턴
		result = Utils.parseStringToInt("aa10", 1);//파싱할 수 없을 떄 두번째 인자값 리턴
		result = Utils.parseStringToInt("aa10");//0리턴
		result = Utils.parseStringToInt("9");//9리턴
		System.out.println(result);
		
		int[] arr = {4, 5, 11, 223, 3, 10};
		Utils.sortASC(arr);//오름차순정렬
		Utils.printArr(arr);//[3,4,5,10,11,223]
		Utils.sortDESC(arr);//내림순정렬
		Utils.printArr(arr);//[223,11,10,5,4,3]
		/*
		int[] rArr = Utils.createRandomArr(1, 12, 7);//1~9 랜덤한 값을 5칸 가지는 정수형 배열을 리턴
		Utils.printArr(rArr);
		
		//랜덤한 숫자가 나올수 있는 범위보다 큰칸을 요구하는 경우 null을 리턴
		rArr =  Utils.createRandomArr(5, 15, 13);
		Utils.printArr(rArr);//null이 넘어오면 "arr is null을 출력"
		rArr =  Utils.createRandomArr(5, 15, 11);
		Utils.printArr(rArr);
		
		String star = makeStarTriangle(5); //결과값 문자열로 넘기기
		System.out.println(star);
		*/
		
	}
	
	public static void gugudan(int n1, int n2) {
		for(int i=n1; i<=n2; i++) {
			for(int z=1; z<10; z++) {
				System.out.printf("%d + %d = %d\n", i, z, (i*z));
			}
			System.out.println();
		}
	}
	
	public static int sum(int...arr) {
		int temp=0;
		for(int i=0; i<arr.length; i++) {
			temp += arr[i];
		}
		return temp;
	}
}

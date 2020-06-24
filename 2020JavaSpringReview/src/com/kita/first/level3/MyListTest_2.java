package com.kita.first.level3;

import java.util.Arrays;

public class MyListTest_2 {
	public static void main(String[] args) {
		MyList list = new MyList();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(1, 1200);	// 10, 15, 20 ? 10 , 1200, 15, 20
		
		int len = list.size(); //2
		int val = list.get(1); //15
		val = list.get(0); //10
		
		//list.remove();
		//int delVal = list.remove(); // 마지막 값 지우고 지우는 값 리턴
		int delVal = list.remove(2);
		
		MyArrays.print(list); // [10, 1200, 15] 프린트 되도록!
		String str = MyArrays.toString(list); // [10, 1200, 15] 문자열 리턴하도록!
		// Arrays.toString 메소드 사용금지! 구현하기
		System.out.println(str);
	}
}

class MyArrays {
	static void print(MyList arr) {	// MyArrays 호출하지 않아도 사용할 수 있도록 메모리에 올라갈 수 있게 static 붙임
		int[] temp = new int[arr.size()];
		for(int i=0; i<arr.size(); i++) {
			temp[i] = arr.get(i);
		}
		System.out.println(Arrays.toString(temp));
	}
	
	static String toString(MyList arr) {
		String str = "";
		for(int i=0; i<arr.size(); i++) {
			if(i>0) {str+=", ";}
			str+=arr.get(i);
		}
		//return "["+str+"]";
		return String.format("[%s]", str);
				
	}
}

class MyList {
	private int[] arr; 	// 프라이빗 전역변수 선언
	
	MyList() {
		init();
	}
	
	private void init() { 	// arr 안에 들어가는 값도 private이어야!
		arr = new int[0];
	}
	
	public void add(int n) {
		int[] temp = new int[arr.length+1];
		for(int i=0; i<arr.length; i++) {
			temp[i]=arr[i];
		}
		temp[arr.length] = n;
		arr=temp;
	}
	
	public void add(int idx, int n) {
		int[] temp = new int[arr.length+1];
		for(int i=0; i<temp.length; i++) {
			temp[i] = (i<idx) ? (arr[i]) : (arr[i-1]);
		}
		temp[idx]=n;
	}
	
	public int size() {
		return arr.length;
	}
	
	public int get(int idx) {
		return arr[idx];
	}
	
	public int remove(int idx) {
		int[] temp = new int[arr.length-1];
		for(int i=0; i<temp.length; i++) {
			temp[(i<idx) ? (i):(i+1)]=arr[i];
		}
		int n = arr[idx];
		arr=temp;
		return n;
	}
}

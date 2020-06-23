package com.kita.first.level3;

import java.util.Arrays;

public class MyListTest {
	public static void main(String[] args) {
		MyList list = new MyList();
		list.add(10);
		list.add(15);
		
		int len = list.size(); //2
		int val = list.get(1); //15
		val = list.get(0); //10
		
		list.remove();	// 제일 마지막 값 없애기
		// 추가로 해보기: 인덱스 선택해서 remove, 배열 중 어느 인덱스에 어느 값 넣을지
		
		list.add(0, 3);
		list.remove(1);
	}
}

class MyList {	// 메모: class가 붕어빵틀, 메인메소드 든 클래스 바깥에 따로 정의
	// private int[] arr = new int[0];
	// 메모: 아래 방식으로 하려고 노력하자, 기억 잘 안 남 다시 복습하기
	private int[] arr;
	
	MyList() {
		init();
	}
	private void init() {
		arr = new int[0];
	}
	
	void add(int n) {
		int[] temp = new int[arr.length+1];
		
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[arr.length] = n;
		arr = temp;
		System.out.println(Arrays.toString(arr));
	}
	
	int size() {
		return arr.length;
	}
	
	int get(int idx) {
		return arr[idx];
	}
	
	void remove() {
		int[] temp = new int[arr.length-1];
		
		for(int i=0; i<arr.length-1; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
		System.out.println(Arrays.toString(arr));
	}
	
	void add(int idx, int n) {
		int[] temp = new int[arr.length+1];
		for(int i=0; i<idx; i++) {
			temp[i] = arr[i];
		}
		temp[idx] = n;
		for(int z=idx+1; z<temp.length; z++) {
			temp[z] = arr[z-1];
		}
		arr=temp;
		System.out.println(Arrays.toString(arr));
	}
	
	void remove(int idx) {
		int[] temp = new int[arr.length-1];
		for(int i=0; i<idx; i++) {
			temp[i] = arr[i];
		}
		for(int z=idx+1; z<temp.length; z++) {
			temp[z] = arr[z];
		}
		arr=temp;
		System.out.println(Arrays.toString(arr));
	}
}
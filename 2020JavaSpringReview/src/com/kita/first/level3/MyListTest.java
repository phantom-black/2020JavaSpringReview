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
		
		list.remove();	// ���� ������ �� ���ֱ�
		// �߰��� �غ���: �ε��� �����ؼ� remove, �迭 �� ��� �ε����� ��� �� ������
		
		list.add(0, 3);
		list.remove(1);
	}
}

class MyList {	// �޸�: class�� �ؾƲ, ���θ޼ҵ� �� Ŭ���� �ٱ��� ���� ����
	// private int[] arr = new int[0];
	// �޸�: �Ʒ� ������� �Ϸ��� �������, ��� �� �� �� �ٽ� �����ϱ�
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
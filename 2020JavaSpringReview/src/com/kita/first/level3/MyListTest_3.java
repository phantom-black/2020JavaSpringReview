package com.kita.first.level3;

import java.util.Arrays;

public class MyListTest_3 {
	public static void main(String[] args) {
		MyList list = new MyList();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(1, 1200);
		
		int len = list.size(); //2
		int val = list.get(1); //15
		val = list.get(0); //10
		
		//list.remove();
		//int delVal = list.remove(); // ������ �� ����� ����� �� ����
		int delVal = list.remove(2);
		
		//MyArrays.print(list); // [10, 1200, 15] ����Ʈ �ǵ���
		String str = MyArrays.toString(list); // [10, 1200, 15] ���ڿ� ����
		
		System.out.println("str : " + str);
		
		//Arrays.toString �޼ҵ� ������! �����ϱ�
	}
}

class MyArrays {
	
	public static void print(MyList arr) { // ***ȣ������ �ʾƵ� �޸𸮿� �ö� �־�� �ٷ� ��� �����ϹǷ� static ���̱�!!
		int[] temp = new int[arr.size()];
		for(int i=0; i<arr.size(); i++) {
			temp[i] = arr.get(i);
		}
		System.out.println(Arrays.toString(temp));
	}
	
	public static String toString (MyList arr) {
		int[] temp = new int[arr.size()];
		String str="";
		for(int i=0; i<arr.size(); i++) {
			temp[i] = arr.get(i);
		}
		for(int i=0; i<temp.length; i++) {
			if (i>0) {
				str += ", ";
			}
			str += temp[i];
		}
		//return "[" + str + "]";
		return String.format("[%s]", str);
	}
}

class MyList {
	private int[] arr;
	
	MyList() {
		init();
	}
	
	private void init() {
		arr = new int[0];
	}
	
	public void add(int n) {
		add(arr.length, n);
	}
	
	public void add(int idx, int n) {
		int[] temp = new int[arr.length+1];
		for(int i=0; i<arr.length; i++) {
			temp[(i<idx) ? (i) : (i+1)] = arr[i];
		}
		temp[idx] = n;
		arr = temp;
	}
	
	public int size() {
		return arr.length;
	}
	
	public int get(int idx) {
		return arr[idx];
	}
	
	public int remove() {
		return remove(arr.length-1); // ���� �ȿ� �־��ֱ�!
	}
	
	public int remove(int idx) {
		int[] temp = new int[arr.length-1];
		int n;
		for(int i=0; i<temp.length; i++) {
			temp[i] = arr[(i<idx) ? (i) : (i+1)];
		}
		n = arr[idx];
		arr=temp;
		return n;
	}
}

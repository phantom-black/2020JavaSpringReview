package com.kita.second;

public class Utils {
	public static int parseStringToInt(String str, int n) {
		int result=n;
		try {
			result = Integer.parseInt(str);
		} catch(Exception e) {}
		return result;
	}
	
	public static int parseStringToInt(String str) {
		return parseStringToInt(str, 0);
	}
	
	public static void sortDESC(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int z=0; z<i; z++) {
				if(arr[i]>arr[z]) {
					int temp = arr[i];
					arr[i] = arr[z];
					arr[z] = temp;
				}
			}
		}
	}
	
	public static void sortASC(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int z=0; z<i; z++) {
				if(arr[i]<arr[z]) {
					int temp = arr[i];
					arr[i] = arr[z];
					arr[z] = temp;
				}
			}
		}
	}
	
	public static void printArr(int[] arr) {
		if(arr==null) {
			System.out.println("arr is null");
			return;
		}
		
		System.out.print("[");
		for(int i=0; i<arr.length; i++) {
			System.out.printf(i<arr.length-1 ? "%d, " : "%d]", arr[i]);
		}
		System.out.println();
	}
}

package com.kita.second;

public class Gugudan {
	public static void main(String[] args) {
		gugudan(2, 5);
		
		int sum = sum(1,2); //3
		sum = sum(1,2,3); //6
		sum = sum(1,2,3,4,5,6,7,8,9,10,11,12);
		int result = Utils.parseStringToInt("10", 0);//10������ ����
		result = Utils.parseStringToInt("aa10", 1);//�Ľ��� �� ���� �� �ι�° ���ڰ� ����
		result = Utils.parseStringToInt("aa10");//0����
		result = Utils.parseStringToInt("9");//9����
		System.out.println(result);
		
		int[] arr = {4, 5, 11, 223, 3, 10};
		Utils.sortASC(arr);//������������
		Utils.printArr(arr);//[3,4,5,10,11,223]
		Utils.sortDESC(arr);//����������
		Utils.printArr(arr);//[223,11,10,5,4,3]
		/*
		int[] rArr = Utils.createRandomArr(1, 12, 7);//1~9 ������ ���� 5ĭ ������ ������ �迭�� ����
		Utils.printArr(rArr);
		
		//������ ���ڰ� ���ü� �ִ� �������� ūĭ�� �䱸�ϴ� ��� null�� ����
		rArr =  Utils.createRandomArr(5, 15, 13);
		Utils.printArr(rArr);//null�� �Ѿ���� "arr is null�� ���"
		rArr =  Utils.createRandomArr(5, 15, 11);
		Utils.printArr(rArr);
		
		String star = makeStarTriangle(5); //����� ���ڿ��� �ѱ��
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

package hw5;

import java.util.Arrays;

public class Homework5_2 {
//	請設計一個方法為randAvg(),
//	從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如下:
//	本次亂數結果: 32 35 15 12 81 28 20 45 40 21 
//	平均值為: 32
	public static void main(String[] args) {
		randAvg();
	}

	public static void randAvg() {
		System.out.println("===取十個整數亂數及其平均值===");
		int[] numList = new int[10];
		int sum = 0;
		for (int i = 0; i < numList.length; i++) {
			int currentNum = (int) (Math.random() * 101);
			numList[i] = currentNum;
			sum += currentNum;
		}
		int avg = (int) sum / 10;
		System.out.printf("本次亂數結果為: %s\n", Arrays.toString(numList));
		System.out.printf("平均值為: %d\n", avg);
	}
}
package hw5;

import java.util.Scanner;

public class Homework5_1 {
//	請設計一個方法為starSquare(int width, int height)
//	當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如下:
//	請輸入寬與高: 5 4
//	*****
//	*****
//	*****
//	*****
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		starSquare(sc);
		sc.close();
	}

	public static void starSquare(Scanner sc) {
		while (true) {
			System.out.println("\n===列印出指定寬高的方形===");
			System.out.print("請輸入寬與高:");
			int width = sc.nextInt();
			int height = sc.nextInt();
			if (width > 0 && height > 0) {
				for (int i = 0; i < height; i++) {
					System.out.println();
					for (int j = 0; j < width; j++) {
						System.out.print("*");
					}
				}
				break;
			} else {
				System.out.println("請輸入兩個大於0的整數");
			}
		}
	}
}

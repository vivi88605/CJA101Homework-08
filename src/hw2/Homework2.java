package hw2;

public class Homework2 {
//	請建立一個TestNineNine.java程式，可輸出九九乘法表
	public void TestNineNine() {

//		一：使用for迴圈 + while迴圈
		System.out.printf("\n一：使用for迴圈 + while迴圈\n");
		for (int i = 1; i <= 9; i++) {
			int j = 1;
			while (j <= 9) {
				System.out.printf("%d*%d=%d\t", i, j, i * j);
				j++;
			}
			System.out.println();
		}

//		二：使用for迴圈 + do while迴圈
		System.out.printf("\n二：使用for迴圈 + do while迴圈\n");
		for (int i = 1; i <= 9; i++) {
			int j = 1;
			do {
				System.out.printf("%d*%d=%d\t", i, j, i * j);
				j++;
			} while (j <= 9);
			System.out.println();
		}

//		三：使用while迴圈 + do while迴圈
		System.out.printf("\n三：使用while迴圈 + do while迴圈\n");
		int i = 1;
		while (i <= 9) {
			int j = 1;
			do {
				System.out.printf("%d*%d=%d\t", i, j, i * j);
				j++;
			} while (j <= 9);
			i++;
			System.out.println();
		}
	}

	public void calculate() {
//		1.請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		System.out.printf("\n1.請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)\n");
		int sum = 0;
		for (int i = 2; i <= 1000; i += 2) {
			sum += i;
		}
		System.out.println(sum);
//		2.請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		System.out.printf("\n2.請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)\n");
		int result = 1;
		for (int i = 1; i <= 10; i++) {
			result *= i;
		}
		System.out.println(result);
//		3.請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		System.out.printf("\n3.請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)\n");
		int result3 = 1;
		int i3 = 1;
		while (i3 <= 10) {
			result3 *= i3;
			i3++;
		}
		System.out.println(result3);
//		4.請設計一隻Java程式,輸出結果為以下: 1 4 9 16 25 36 49 64 81 100
		System.out.printf("\n4.請設計一隻Java程式,輸出結果為以下: 1 4 9 16 25 36 49 64 81 100\n");
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d ", i * i);
		}
		System.out.println();
	}

	public void lottery() {
//		阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//		個位數、十位數都不能有4
//		輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		System.out.printf("\n大樂透\n");
//		4,14,24,34,
//		40,41,42,43,44,45,46,47,48,49
		int count = 0;
		for (int i = 1; i <= 49; i++) {
			if (i % 10 == 4 || i / 10 == 4) {
//				System.out.print(i + " ");
				continue;
			} else {
				System.out.printf("%d ", i);
				count += 1;
			}
		}
		System.out.printf("\n總共有%d個\n", count);
	}

	public void pyramidNum() {
//		請設計一隻Java程式,輸出結果為以下:
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
		System.out.printf("\n輸出數字金字塔\n");
		for (int i = 10; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public void pyramidChar() {
//		請設計一隻Java程式,輸出結果為以下:
//		(用迴圈做出來)
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
		System.out.printf("\n字母金字塔\n");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.printf("%c", i + 65);
			}
			System.out.println();
		}
	}
}

package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		Homework3 hw3 = new Homework3();
		hw3.testTriangle();
		hw3.guessNumber();
		hw3.lotterySelector();
	}

	public void testTriangle() {
		// 請設計一隻程式，使用者輸入三個數字後，
		// 輸出結果會為正三角形、等腰三角形、直角三角形、其它三角形或不是三角形。
		Scanner sc = new Scanner(System.in);
		System.out.println("===三角形判斷===");
		int[] triangle = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.printf("請輸入第%d個邊長:", i + 1);
			triangle[i] = sc.nextInt();
		}
		Arrays.sort(triangle);
		int a = triangle[0], b = triangle[1], c = triangle[2];
		String result = "";
		if (a + b > c) {
			// 判斷是否為三角形
			if (a == b && b == c) {
				// 判斷是否為正三角形
				result = "是正三角形";
			} else if ((a == b || b == c) && (a * a + b * b == c * c)) {
				// 判斷是否為等腰直角三角形
				result = "是等腰直角三角形";
			} else if (a == b || b == c) {
				// 判斷是否為等腰三角形
				result = "是等腰三角形";
			} else if (a * a + b * b == c * c) {
				// 判斷是否為直角三角形
				result = "是直角三角形";
			} else {
				// 其他三角形
				result = "是三角形";
			}
		} else {
			result = "不是三角形";
		}
		System.out.printf("三邊由小到大為:%d %d %d，%s。\n", triangle[0], triangle[1], triangle[2], result);
	}

	public void guessNumber() {
		// 請設計一隻程式，會亂數產生一個0~100的數字，然後可以玩猜數字遊戲。
		// 猜錯會提示大於或小於正確答案，猜對時顯示＂猜對了！答案就是N＂
		System.out.println("===猜一個0~100之間的數字===");
		Scanner sc = new Scanner(System.in);
		int ans = (int) (Math.random() * (100 + 1)) + 0;
//		System.out.println("答案:" + ans);
		while (true) {
			System.out.print("猜數字:");
			int guess = sc.nextInt();
			if (guess == ans) {
				System.out.printf("猜對了!答案就是%d\n", guess);
				break;
			} else if (guess < ans) {
				System.out.printf("答案比%d還大喔\n", guess);
			} else {
				System.out.printf("答案比%d還小喔\n", guess);
			}
		}
	}

	public void lotterySelector() {
		// 阿文很喜歡簽大樂透(1~49)，但他是個善變的人，
		// 上次討厭數字是4，但這次他想要依心情決定討厭哪個數字。
		// 請您設計一隻程式，讓阿文可以輸入他不想要的數字(1~9)，
		// 畫面會顯示他可以選擇的號碼與總共有幾個號碼可以選。
		System.out.println("===大樂透選號===");
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("這次大樂透選號不想要哪個數字:");
			int num = sc.nextInt();
			int count = 0;
			if (1 <= num && num <= 9) {
				for (int i = 1; i <= 49; i++) {
					if (i / 10 == num || i % 10 == num) {
						continue;
					} else {
						System.out.printf("%d ", i);
						count++;
					}
				}
				System.out.printf("\n不包含%d的話有%d個號碼可以選", num, count);
				break;
			} else {
				System.out.println("請輸入一個1~9之間的數字");
			}
		}
	}
}
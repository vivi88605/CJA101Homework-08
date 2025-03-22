package hw4;

import java.util.Scanner;

public class Homework4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] myArr = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		arrAVG(myArr);
		reverseStr(sc);
		countVowel();
		borrowMoney(sc);
		countDay(sc);
		highestScore();
		sc.close();
	}

//	- 有個一維陣列如下:
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//	(提示:陣列,length屬性)
	public static void arrAVG(int[] arr) {
		System.out.println("===輸出平均值與大於平均值的元素===");
		int sum = 0;
		String aboveAvg = "";
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double avg = sum / arr.length;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > avg) {
				aboveAvg += arr[i];
				aboveAvg += " ";
			}
		}
		System.out.printf("平均=%.2f, 大於平均的數字為%s\n", avg, aboveAvg);
	}

//	- 請建立一個字串,經過程式執行後,輸入結果是反過來的
//	例如String s = “Hello World”,執行結果即為dlroW olleH
//	(提示:String方法,陣列)
	public static void reverseStr(Scanner sc) {
		System.out.println("\n===輸出反轉的字串===");
		String str = sc.next();
		String reversedStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversedStr += str.charAt(i);
		}
		System.out.printf("反轉後的字串為%s\n", reversedStr);
	}

//	- 有個字串陣列如下 (八大行星):
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//	(提示:字元比對,String方法)
	public static void countVowel() {
		System.out.println("\n===算母音數量===");
		String[] eightPlanet = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int count = 0;
		for (int i = 0; i < eightPlanet.length; i++) {
			for (int j = 0; j < eightPlanet[i].length(); j++) {
				char temp = eightPlanet[i].charAt(j);
				if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
					count++;
				}
			}
		}
		System.out.printf("八大行星的名字中有%d個母音\n", count);
	}

//	阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//	表如下:
//	25號2500元；32號800元；8號500元；19號1000元；27號1200元；
//	請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//	有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//	員工編號: 25 19 27 共 3 人!」
//	(提示:Scanner,二維陣列)
	public static void borrowMoney(Scanner sc) {
		System.out.println("\n===跟同事借錢===");
		System.out.print("阿文想借多少錢:");
		int moneyToBorrow = sc.nextInt();
		int[] coworkerId = { 25, 32, 8, 19, 27 };
		int[] coworkerCash = { 2500, 800, 500, 1000, 1200 };
		String borrowFrom = "";
		int count = 0;
		for (int i = 0; i < coworkerCash.length; i++) {
			if (coworkerCash[i] >= moneyToBorrow) {
				borrowFrom += coworkerId[i];
				borrowFrom += " ";
				count++;
			}
		}
		System.out.printf("員工編號: %s共 %d 人!", borrowFrom, count);
	}

//	請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//	例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//	(提示1:Scanner,陣列)
//	(提示2:需將閏年條件加入)(網路搜尋閏年條件)
//	(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
	public static void countDay(Scanner sc) {
		/*
		 * 閏年:除以4能整除，且除以100不能整除;如果剛好是100的倍數，且除以400能整除
		 */
		System.out.println("\n===是今年的哪一天===");
		System.out.print("西元幾年:");
		int year = sc.nextInt();
		System.out.print("幾月:");
		int month = sc.nextInt();
		System.out.print("幾號:");
		int day = sc.nextInt();
		int[] dayPerMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			dayPerMonth[1] += 1;
		}
		while (true) {
			if (month > 0 && month <= 12 && day > 0 && day < dayPerMonth[month - 1]) { // 日期合法
				int dayCount = 0;
				for (int i = 0; i < (month - 1); i++) {
					dayCount += dayPerMonth[i];
				}
				dayCount += day;
				System.out.printf("輸入的日期為該年第%d天", dayCount);
				break;
			} else {
				System.out.printf("%d月%d日不存在\n", month, day);
				break;
			}
		}
	}

//	班上有8位同學,他們進行了6次考試結果如下:
//	請算出每位同學考最高分的次數(全班最高分的次數)
//	(提示:二維陣列)
	public static void highestScore() {
		System.out.println("\n===每位同學的最高分次數===");
		int[][] scoreList = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		int[] highestScoreCount = { 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < scoreList.length; i++) {
			int highestScoreIndex = 0;
			for (int j = 0; j < scoreList[i].length; j++) {
				int[] currentExam = scoreList[i];
				if (currentExam[j] > currentExam[highestScoreIndex]) {
					highestScoreIndex = j;
//					System.out.println(j);
				}
			}
			highestScoreCount[highestScoreIndex]++;
//			System.out.print(highestScoreIndex);
		}
		for (int i = 0; i < highestScoreCount.length; i++) {
			System.out.printf("%d號同學最高分的次數: %d次\n", (i + 1), highestScoreCount[i]);
		}
	}
}
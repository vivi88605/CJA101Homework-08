package hw4;

public class Homework4 {
	public static void main(String[] args) {
		int[] myArr= {29,100,39,41,50,8,66,77,95,15};
		ArrAVG(myArr);
	}

//	- 有個一維陣列如下:
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//	(提示:陣列,length屬性)
	public static void ArrAVG(int[] arr) {
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
		System.out.printf("average=%.2f, number above average=%s\n", avg, aboveAvg);
	}
	
//	- 請建立一個字串,經過程式執行後,輸入結果是反過來的
//	例如String s = “Hello World”,執行結果即為dlroW olleH
//	(提示:String方法,陣列)
	public static void reverseStr(String str) {
		System.out.println("===輸出反轉的字串===");
	}
	
//	- 有個字串陣列如下 (八大行星):
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//	(提示:字元比對,String方法)
	
//	阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//	表如下:
//	25號2500元；32號800元；8號500元；19號1000元；27號1200元；
//	請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//	有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//	員工編號: 25 19 27 共 3 人!」
//	(提示:Scanner,二維陣列)
	
//	請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//	例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//	(提示1:Scanner,陣列)
//	(提示2:需將閏年條件加入)(網路搜尋閏年條件)
//	(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
	
//	班上有8位同學,他們進行了6次考試結果如下:
//	{{10,35,40,100,90,85,75,70},{37,75,77,89,64,75,70,95},{100,70,79,90,75,70,79,90},{77,95,70,89,60,75,85,89},{98,70,89,90,75,90,89,90},{90,80,100,75,50,20,99,75}}
//	請算出每位同學考最高分的次數(全班最高分的次數)
//	(提示:二維陣列)
}
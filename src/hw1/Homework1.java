package hw1;

public class Homework1 {
	public static void main(String[] args) {
//		1. 請設計一隻Java程式,計算12,6這兩個數值的和(總和)與積(乘積)
		int plusResult = 12+6;
		int multiplyResult=12*6;
		System.out.printf("1. 12+6=%d, 12*16=%d%n",plusResult,multiplyResult);
		
//		2. 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int eggCount=200;
		int dozenCount=eggCount/12;
		int leftCount=eggCount%12;
		System.out.printf("2. %d eggs = %d dozen and %d eggs%n",eggCount,dozenCount,leftCount);

//		3. 請由程式算出256559秒為多少天、多少小時、多少分與多少秒(不是分別，是幾天幾小時幾分幾秒)
		int secLeft=256559;
		//幾天
		int days=secLeft/(60*60*24);
		secLeft%=(60*60*24);
		//不足一天的有幾小時
		int hours=secLeft/(60*60);
		secLeft%=(60*60);
		//不足一小時的有幾分鐘
		int mins=secLeft/60;
		secLeft%=60;
		//不足一分鐘的有幾秒
		int secs=secLeft;
		System.out.printf("3. 256559 seconds = %dd %dh %dm %ds%n",days,hours,mins,secs);
//		System.out.println(secs+mins*60+hours*60*60+days*60*60*24);
		
//		4. 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double pi=3.1415;
		double radius=5;
		double perimeter=radius*2*pi;
		System.out.printf("4. a circle with a radius of %.0f, has a perimeter of about %.2f%n",radius,perimeter);
		
//		5. 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後
//		本金加利息共有多少錢 (用複利計算,公式請自行google)
		double principal=1500000; //principal本金
		double interestRate=0.02; //interest rate利率
		for(int i=1 ; i<=10 ; i++) {
//			System.out.println(i+" years has pass");
			double interest=principal*interestRate;
			principal+=interest;
//			System.out.println("$"+principal);
		}
		System.out.printf("5. $%.4f%n",principal);
		
		/*
		6. 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
		5 + 5
		5 + ‘5’
		5 + “5”
		並請用註解各別說明答案的產生原因
		 */
		System.out.printf("6. 5+5=%d, ",5+5); //因為整數可以相加
		System.out.printf("5+\'5\'=%d, ",(5+'5'));//因為'5'被轉換成unicode的代碼，並與5相加
		System.out.printf("5+\"5\"=%s",(5+"5"));//因為"5"是字串，所以這邊的+變成串接字串的功能
	}
}

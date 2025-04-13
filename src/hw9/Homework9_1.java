package hw9;

public class Homework9_1 {
//- 開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的競賽過程。
//- 每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。Sleep時間由亂數產生500~3000之間的毫秒數,如圖所示
//- 參考範例:CounterRunnable.java
//- 需留意主執行緒執行順序
	public static void main(String[] args) {
		EatingContest moon = new EatingContest("饅頭人");
		EatingContest james = new EatingContest("詹姆士");
		Thread moonThread = new Thread(moon);
		Thread jamesThread = new Thread(james);
		System.out.println("-----大胃王快食比賽開始！-----");
		moonThread.start();
		jamesThread.start();
		try {
			moonThread.join();
			jamesThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("-----大胃王快食比賽結束！-----");
	}
}

class EatingContest implements Runnable {
	private String name;

	EatingContest() {
		this("參賽者");
	}

	EatingContest(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 11; i++) {
			try {
				int timeUsed = (int) (Math.random() * (3000 - 500 + 1) + 500);
				Thread.sleep(timeUsed);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (i < 11) {
				System.out.printf("%s吃第%d碗飯\n", this.name, i);
			} else {
				System.out.printf("%s吃完了！\n", this.name);
			}
		}
	}
}
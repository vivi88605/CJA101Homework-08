package hw9;

public class Homework9_2 {
//- 熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領錢亂花,不好好唸書,
//所以只要看到熊大帳戶的餘額超過3000元,就會停止匯款給熊大;但要是帳戶餘額在2000元以下,熊大就會要求媽媽匯款給他。
//如果帳戶餘額低於熊大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢已經入帳戶。
//
//假設媽媽一次匯款 2000 元,熊大一次提款1000元,寫一個Java程式模擬匯款10次與提款10次的情形。
//- 參考範例:TestWaitNotify.java
//- 這題做完可能會遇到死結，可以試著理解為何打結及試著解開
	public static void main(String[] args) {
		Account BrownAccount = new Account();
		Brown brown = new Brown(BrownAccount);
		BrownMom brownMom = new BrownMom(BrownAccount);
		Thread brownThread = new Thread(brown);
		Thread brownMomThread = new Thread(brownMom);

		brownThread.start();
		brownMomThread.start();

		try {
			brownThread.join();
			brownMomThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("今天的匯款與提款次數達到上限了！");
	}
}

class Account {
	private int balance = 0;

	synchronized public void deposit(int amount) {
		while (balance >= 3000) {
			try {
				notifyAll();
				System.out.println("媽媽看到餘額超過3000，暫停匯款");
				System.out.println("熊大被老媽告知帳戶已經有錢！");
				wait(); // 餘額大於3000，暫停匯款
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance += amount; // 匯款
		System.out.printf("媽媽存了%d，帳戶共有：%d%n", amount, balance);
		if (balance > 0) {
			notifyAll();
		}
	}

	synchronized public void withdraw(int amount) {
		while (balance < amount) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			System.out.println("媽媽被熊大要求匯款！");
			notifyAll();
			try {
				wait(); // 餘額小於2000，暫停提款
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= amount; // 提款
		System.out.printf("熊大領了%d，帳戶共有：%d%n", amount, balance);
		if (balance <= 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			notifyAll();
		}
	}
}

class Brown implements Runnable {
	Account account;

	Brown(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			account.withdraw(1000); // 每次領出1000
		}
		System.out.println("熊大達到10次提款上限");
	}
}

class BrownMom implements Runnable {
	Account account;

	BrownMom(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			account.deposit(2000); // 每次匯入2000
		}
		System.out.println("媽媽達到10次匯款上限！");
	}
}
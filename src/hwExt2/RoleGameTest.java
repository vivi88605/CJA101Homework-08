package hwExt2;

public class RoleGameTest {
//	附件有四個Java檔案，我們在Hero類別裡設計了defend()與move()方法，
//	但觀察程式碼之後，你會發現我們在繼承父類別實作抽象方法時，
//	對於defend與move方法的實作方法卻都是一模一樣的內容，
//	請同學想想看，是否有較佳的設計能夠解決重複的實作內容
//
//	- 註1：僅需思考，有興趣也可以自行將思考後的結果實現出來
//	- 註2：介面是我們的好幫手！
//	- 註3：可參考JavaEx_Part1的additional套件裡ng與good版本
//	- 註4：此為Design Pattern的Strategy Pattern(策略模式)

	public static void main(String[] args) {
		Hero saber = new SwordMan("亞拉岡", 1, 0);
		Hero archer = new ArrowMan("勒苟拉斯", 1, 0);

		saber.attack();
		saber.move();

		archer.attack();
		archer.move();
	}
}

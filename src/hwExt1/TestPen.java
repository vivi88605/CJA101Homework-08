package hwExt1;

public class TestPen {
//	建立兩個子類別Pencil與InkBrush繼承Pen父類別
//		(1) 實作方法：Pencil輸出為削鉛筆再寫，InkBrush為沾墨汁再寫
//		(2) Pencil實際售價為定價8折，InkBrush為定價9折
//		(3) 多型操作，當共同呼叫write()方法與getPrice()方法，各種筆都可正確顯示write內容與售價金額
	public static void main(String[] args) {
		Pencil myPencil = new Pencil("brandA", 100);
		System.out.println("鉛筆的牌子:" + myPencil.brand);
		System.out.println("鉛筆的價格:" + myPencil.price);
		myPencil.write();
		Pencil myPencil2 = new Pencil();
		System.out.println("鉛筆的牌子:" + myPencil2.brand);
		System.out.println("鉛筆的價格:" + myPencil2.price);
		myPencil.write();
		InkBrush myInkBrush = new InkBrush("branB", 100);
		System.out.println("鋼筆的牌子:" + myInkBrush.brand);
		System.out.println("鋼筆的價格:" + myInkBrush.price);
		myInkBrush.write();
		InkBrush myInkBrush2 = new InkBrush();
		System.out.println("鋼筆的牌子:" + myInkBrush2.brand);
		System.out.println("鋼筆的價格:" + myInkBrush2.price);
		myInkBrush2.write();
	}
}
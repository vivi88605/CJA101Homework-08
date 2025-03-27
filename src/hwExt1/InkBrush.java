package hwExt1;

public class InkBrush extends Pen {
//	建立兩個子類別Pencil與InkBrush繼承Pen父類別
//	(1) 實作方法：Pencil輸出為削鉛筆再寫，InkBrush為沾墨汁再寫
//	(2) Pencil實際售價為定價8折，InkBrush為定價9折
	InkBrush(String brand, double price) {
		super(brand, price * 0.9);
	}

	InkBrush() {
		super("brandName",9);
	}

	public void write() {
		System.out.println("沾墨汁再寫！");
	}
}
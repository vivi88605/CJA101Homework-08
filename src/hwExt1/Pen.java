package hwExt1;

//建立父類別Pen
public abstract class Pen {
//	(1) 兩個屬性：品牌(brand)、價格(price) (封裝設計)
	protected String brand;
	protected double price;

//	(2) 建構子設計：一個無參數與一個根據屬性而設計
	Pen(String brand, double price) {
		this.brand = brand;
		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("請輸入一個大於0的價格");
		}
	}

	Pen() {
		this("brandName", 10);
	}

//	(3) 定義Getter/Setter方法
	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("請輸入一個大於0的價格");
		}
	}

//	(4) 宣告一個抽象方法write()
	public abstract void write();
}
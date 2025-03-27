package hw5;

public class MyRectangle {
//	請設計一個類別MyRectangle:
//		- (1) 有兩個double型態的屬性為width, depth
//		- (2) 有三個方法:
//		    - void setWidth(double width): 將收到的引數指定給width屬性
//		    - void setDepth(double depth): 將收到的引數指定給depth屬性
//		    - double getArea(): 能計算該長方形的面積
//		- (3) 有兩個建構子:
//		    - public MyRectangle(): 不帶參數也無內容的建構子
//		    - public MyRectangle(double width, double depth): 傳入的兩個引數會指定給對應的屬性
	private double width;
	private double depth;

	public void setWidth(double width) {
		if (width > 0) {
			this.width = width;
		} else {
			System.out.println("請將width設置為大於0的數字");
		}
	}

	public void setDepth(double depth) {
		if (depth > 0) {
			this.depth = depth;
		} else {
			System.out.println("請將dept設置為大於0的數字");
		}
	}

	public double getArea() {
		return width * depth;
	}

	public MyRectangle() {
		this(1, 1);
	}

	public MyRectangle(double width, double depth) {
		if (width > 0) {
			setWidth(width);
		} else {
			width = 1;
		}
		if (depth > 0) {
			setDepth(depth);
		} else {
			depth = 1;
		}
	}
}
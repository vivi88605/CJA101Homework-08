package hw5;

public class Homework5_3 {
//	利用Overloading,設計兩個方法
//	int maxElement(int x[][])與double maxElement(double x[][]),
//	可以找出二維陣列的最大值並回傳
	public static void main(String[] args) {
		int[][] intArr = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArr = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		System.out.println(maxElement(intArr));
		System.out.println(maxElement(doubleArr));
	}

	public static int maxElement(int[][] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}

	public static double maxElement(double arr[][]) {
		double max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}
}
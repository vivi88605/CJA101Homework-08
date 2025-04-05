package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Homework8_1 {
	public static void main(String[] args) {
		// 請建立一個Collection物件並將以下資料加入:
		// Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
		// Object物件、“Snoopy”、BigInteger(“1000”)
		Object obj = new Object();
		List<Object> myList = new ArrayList<>(
				Arrays.asList(100, 3.14, 21L, 100, 5.1, "Kitty", (short) 100, obj, "Snoopy", new BigInteger("1000")));

		// - 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
		System.out.println("使用Iterator: ");
		for (Iterator<Object> ListIterator = myList.iterator(); ListIterator.hasNext();) {
			System.out.print(ListIterator.next() + " ");
		}
		System.out.println("\n傳統for:");
		for (int i = 0; i < myList.size(); i++) {
			System.out.print(myList.get(i) + " ");
		}
		System.out.println("\nforeach:");
		for (Object item : myList) {
			System.out.print(item + " ");
		}

		// - 移除不是java.lang.Number相關的物件
		for (Iterator<Object> ListIterator = myList.iterator(); ListIterator.hasNext();) {
			while (ListIterator.hasNext()) {
				if (!(ListIterator.next() instanceof Number)) {
					ListIterator.remove();
				}
			}
		}

		// - 再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功
		System.out.println("\n移除非Num相關物件:");
		for (int i = 0; i < myList.size(); i++) {
			System.out.print(myList.get(i) + " ");
		}
	}
}
package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) throws CalException {
		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator();
		c.powerXY(sc);
	}
}

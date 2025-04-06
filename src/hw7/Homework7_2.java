package hw7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Homework7_2 {
//請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用append功能讓每次執行結果都能被保存起來)
	public static void main(String[] args) {
		File data = new File("src\\hw7\\Data.txt");
		writeFile(data);
	}

	public static void writeFile(File dest) {
		// 建立檔案位置
		try (FileWriter out = new FileWriter(dest, true)) {
			// 在檔案位置建立檔案
			dest.createNewFile();
			for (int i = 0; i < 10; i++) {
				// 產生亂數
				int randomNum = (int) ((Math.random() * 1000)) + 1;
				// 寫入亂數
				out.write(randomNum + "\n");
//				System.out.println("寫入");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

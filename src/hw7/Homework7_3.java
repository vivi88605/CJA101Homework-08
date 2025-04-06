package hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Homework7_3 {
//請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所代表的檔案會複製到第二個參數代表的檔案
	public static void main(String[] args) {
		File copyFrom1 = new File("src/hw7/copyFrom.txt");
		File copyTo1 = new File("src/hw7/copyTo.txt");
		
		Homework7_2.writeFile(copyFrom1);
		try {
			copyFrom1.createNewFile();
			copyTo1.createNewFile();
			copyFile(copyFrom1,copyTo1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void copyFile(File copyFrom, File copyTo) {
		try {
			FileReader fr = new FileReader(copyFrom);
			FileWriter fw = new FileWriter(copyTo);
			BufferedWriter bw = new BufferedWriter(fw);
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
			}
			br.close();
			bw.close();
			fw.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

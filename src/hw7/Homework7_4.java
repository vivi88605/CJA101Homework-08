package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Homework7_4 {
//請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。
//注意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾
	public static void main(String[] args) {
		// create Object.ser
		File dest = new File("C:/data");
		if (!dest.exists()) {
			dest.mkdirs();
		}
		File Object = new File("C:/data/Object.ser");
		// create cats & dogs
		Cat cat1 = new Cat("cat1");
		Cat cat2 = new Cat("cat2");
		Dog dog1 = new Dog("dog1");
		Dog dog2 = new Dog("dog2");
		try {
			Object.createNewFile();
			writeFile(Object, cat1, cat2, dog1, dog2);
			runFile(Object);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void writeFile(File file, Object... objs) {
		try {
			FileOutputStream fis = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fis);
			for (Object obj : objs) {
				oos.writeObject(obj);
			}
			oos.close();
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何 (請利用多
//型簡化本題的程式設計)
	public static void runFile(File file) {
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			for (int i = 0; i < 4; i++) {
				Object obj = ois.readObject();
				if (obj instanceof Animal) {
					((Animal) obj).speak();
				} else {
					System.out.println("not an animal");
				}
			}
			ois.close();
			fis.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
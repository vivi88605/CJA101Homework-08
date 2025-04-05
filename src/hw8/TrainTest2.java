package hw8;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TrainTest2 {
	public static void main(String[] args) {
		MakeTrain t = new MakeTrain();
		List trainList = t.makeTrain();
//		- 請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出
		System.out.println("- 請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出");
		Collections.sort(trainList);
		Iterator it2 = trainList.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next().toString());
		}
	}
}
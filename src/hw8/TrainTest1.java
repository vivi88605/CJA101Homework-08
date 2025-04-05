package hw8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TrainTest1 {
	public static void main(String[] args) {
		MakeTrain t = new MakeTrain();
		List trainList = t.makeTrain();
		
//		- 請寫一隻程式,能印出不重複的Train物件
		System.out.println("- 請寫一隻程式,能印出不重複的Train物件");
		Set trainSet = new HashSet();
		Iterator it = trainList.iterator();
		while(it.hasNext()) {
			trainSet.add(it.next());
		}
		Iterator it2=trainSet.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next().toString());
		}
	}
}
package hw8;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TrainTest3 {
	public static void main(String[] args) {
		MakeTrain t = new MakeTrain();
		List trainList = t.makeTrain();

//	- 承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件
		System.out.println("- 承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件");
		Set orderedTrainSet = new TreeSet();
		Iterator it = trainList.iterator();
		while (it.hasNext()) {
			orderedTrainSet.add(it.next());
		}
		Iterator it2 = orderedTrainSet.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next().toString());
		}
	}
}
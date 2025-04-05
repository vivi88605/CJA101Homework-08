package hw8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeTrain {
	public List<Train> makeTrain() {
//	- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
//	- (1254, “區間”, “屏東”, “基隆”, 700)
//	- (118, “自強”, “高雄”, “台北”, 500)
//	- (1288, “區間”, “新竹”, “基隆”, 400)
//	- (122, “自強”, “台中”, “花蓮”, 600)
//	- (1222, “區間”, “樹林”, 七堵, 300)
//	- (1254, “區間”, “屏東”, “基隆”, 700)
	Train train1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
	Train train2 = new Train(1254, "區間", "屏東", "基隆", 700);
	Train train3 = new Train(118, "自強", "高雄", "台北", 500);
	Train train4 = new Train(1288, "區間", "新竹", "基隆", 400);
	Train train5 = new Train(122, "自強", "台中", "花蓮", 600);
	Train train6 = new Train(1222, "區間", "樹林", "七堵", 300);
	Train train7 = new Train(1254, "區間", "屏東", "基隆", 700);
	List trainList = new ArrayList(Arrays.asList(train1, train2, train3, train4, train5, train6, train7));
	return trainList;
	}
}

package hw8;

import java.util.Objects;

public class Train<T> implements Comparable<Train>{
//- 請設計一個Train類別,並包含以下屬性:
//	- 班次 number,型別為int 
//	- 車種 type,型別為String 
//	- 出發地 start,型別為String
//	- 目的地 dest,型別為String
//	- 票價 price,型別為double
//- 設計對應的getter/setter方法,並在main方法裡透過建構子產生以下7個Train的物件,放到每小題需使用的集合裡
	private T item;

	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	Train() {
		this(0000, "車種", "出發地", "目的地", 0);
	}

	// 複寫toString
	public String toString() {
		String result;
		result = "班次:" + number + " 車種:" + type + " 出發地:" + start + " 目的地:" + dest + " 票價:" + price;
		return result;
	}
	
	// 複寫hashCode及equals
	@Override
	public int hashCode() {
		return Objects.hash(dest, item, number, price, start, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && Objects.equals(item, other.item) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}

	// 泛型setter
	public void setItem(T item) {
		this.item = item;
	}

	// 泛型getter
	public T getItem(T item) {
		return this.item;
	}
	
    // 改為班次編號由大到小排序
    @Override
    public int compareTo(Train t) {
        return Integer.compare(t.number, this.number); // 降序排序
    }
}

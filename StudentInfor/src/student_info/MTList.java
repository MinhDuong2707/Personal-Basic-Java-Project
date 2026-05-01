package student_info;

public class MTList implements IList {
	public String danhSachHocBong() {
		return "Kết thúc danh sách.";
	}
	public String toString() {
		return "";
	}
	public IList insert(Information other) {
		return new ConsList(other, new MTList());
	}
	public IList sort() {
		return new MTList();
		
	}

}

package student_info;

public class ConsList implements IList {
	private Information first;
	private IList rest;
	public ConsList(Information first, IList rest) {
		super();
		this.first = first;
		this.rest = rest;
	}
	public String toString() {
		return first.toString()+rest.toString();
	}
	public String danhSachHocBong() {
		if(first.diemTrungBinh()>= 8) {
			return first.toString()+rest.danhSachHocBong();
		}else {
			return rest.danhSachHocBong();
		}
	}
	public IList insert(Information other) {
		if(first.diemTrungBinh()>=other.diemTrungBinh()) {
			return new ConsList(first, rest.insert(other));
			}else {
				return new ConsList(other, rest.insert(first));
		}
	}
	public IList sort() {
		return rest.sort().insert(first);
	}

}

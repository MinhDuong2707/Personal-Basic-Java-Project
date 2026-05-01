package student_info;

public interface IList {
	public String toString();
	public String danhSachHocBong();
	public IList insert(Information other);
	public IList sort();

}

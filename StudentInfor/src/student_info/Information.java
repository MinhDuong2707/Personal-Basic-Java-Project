package student_info;

import java.math.RoundingMode;

public class Information {
	private String studentID;
	private String name;
	private double diemToan;
	private double diemLy;
	private double diemTin;
	public Information(String studentID, String name, double diemToan, double diemLy, double diemTin) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemTin = diemTin;
	}
	public double diemTrungBinh() {
		return (diemToan+diemLy+diemTin)/3;
	}
	@Override
	public String toString() {
		return studentID + " | " + name + " | Toán: " + diemToan + " | Lý: "
				+ diemLy + " | Tin: " + diemTin +" | ĐTB: "+this.diemTrungBinh()+"\n";
	}
	
	

}

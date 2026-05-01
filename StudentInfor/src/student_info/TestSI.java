package student_info;

import junit.framework.TestCase;

public class TestSI extends TestCase {
	public void testAll() {
		Information i1 = new Information("SV01", "Nguyễn Văn A", 9, 8, 9);
		Information i2 = new Information("SV02", "Trần Thị B", 7, 8, 7);
		Information i3 = new Information("SV03", "Lê Văn C", 8, 9, 10);
		IList l1 = new MTList();
		IList l2 = new ConsList(i1, l1);
		IList l3 = new ConsList(i2, l2);
		IList l4 = new ConsList(i3, l3);
		System.out.println(l4.danhSachHocBong());
		System.out.println(l4.sort().toString());
	}

}

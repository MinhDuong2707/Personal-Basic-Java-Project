package labjava_1;
import java.util.List;
import java.util.ArrayList;
public class DanhSachNhanVien {
    private List<Employee> danhSach;

    public DanhSachNhanVien(List<Employee> danhSach) {
        this.danhSach = new ArrayList<>(danhSach);
    }

    @Override
    public String toString() {
        String ketQua = "";
        for(Employee ds :danhSach){
            ketQua += ds.toString()+"\n";
        }
        return ketQua;
    }

    public void emYear(){
        System.out.println("Các nhân viên trong danh sách có năm sinh lớn hơn 2004 là : ");
        for(int i=0; i<danhSach.size();i++){
            if(danhSach.get(i).getHiredDate().getYear()>2004){
                System.out.println(danhSach.get(i).toString());
            }
        }
    }
    public List<Employee> sapXepDS(){
        for(int i=0; i<danhSach.size();i++){
            for(int j =i+1; j<danhSach.size();j++){
                if(danhSach.get(i).getName().compareTo(danhSach.get(j).getName())>0){
                    Employee temp = danhSach.get(i);
                    danhSach.set(i,danhSach.get(j));
                    danhSach.set(j,temp);
                }
            }
        }
        return danhSach;
    }
}

package labjava_1;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class MainEmployee {
    public static void main(String[] args) {
        Employee e1 = new SalaryEmployee("Nguyen Hoang",new Date(20,5,2001),50000000,2500);
        Employee e2 = new HourlyEmployee("Tran Minh",new Date(30,6,2005),50000,45);
        Employee e3 = new Consultant("Le Van",new Date(25,9,2004),"012030",5000000);
        System.out.println(e1.toString()+"\n"+e2.toString()+"\n"+e3.toString());
        System.out.println(e1.monthlySalary());
        Employee e4 = new Consultant("Nguyen Duong",new Date(27,7,2007),"070707",7000000);
        Employee e5 = new SalaryEmployee("Nguyen Phat",new Date(29,1,2007),30000000,3000);
        Employee e6 = new HourlyEmployee("Nguyen Trong",new Date(17,3,2007),100000,50);
        Employee e7 = new SalaryEmployee("Tran A",new Date(6,5,2003),55000000,2000);
        Employee e8 = new HourlyEmployee("Ha C",new Date(30,7,2004),50000,47);
        Employee e9 = new Consultant("Le D",new Date(20,8,2002),"012050",4500000);
        Employee e10 = new SalaryEmployee("Luu E",new Date(25,4,1999),60000000,3500);
        DanhSachNhanVien listDS = new DanhSachNhanVien(new ArrayList<>(Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10)));
        listDS.emYear();
        listDS.sapXepDS();
        System.out.println(listDS.toString());

    }
}

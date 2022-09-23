package collectionnmap;

import java.time.LocalDate;
import java.util.*;


public class RetryTTCSolutionCompany {
    public static void employeeByDepartment(Map<String, ArrayList<Staff>> department, ArrayList<Staff> employees) {
        for (Staff employee : employees) {
            ArrayList<Staff> employeeDepartment = department.get(employee.getDepartment());
            if (employeeDepartment == null) {
                employeeDepartment = new ArrayList<Staff>(){{
                    add(employee);
                }};
            } else {
                employeeDepartment.add(employee);
            }
            department.put(employee.getDepartment(), employeeDepartment);
        }
    }
    public static void printStaffList(Map<String, ArrayList<Staff>> department) {
        System.out.println("Phòng hành chính nhân sự : " + department.get("HCNS"));
        System.out.println("Phòng chăm sóc khách hàng : " + department.get("CSKH"));
        System.out.println("Phòng SALE : " + department.get("SALE"));
        System.out.println("Phòng ban điều hành : " + department.get("BOD"));
        System.out.println("Phòng sản xuất : " + department.get("PRODUCT"));
    }
    public static void main(String[] args) {
        ArrayList<Staff> staffs = new ArrayList<Staff>() {
            {
                Double salary = 8.;
                add(new Staff("Nam", "0454214655", "HD", LocalDate.parse("2001-12-14"), "B0D","CEO",15, 20000000D));
                add(new Staff("Thang", "0984564645", "NA", LocalDate.parse("2001-08-15"), "HCNS","HR",6, 15000000D));
                add(new Staff("Hiep", "0454489454", "ND", LocalDate.parse("2001-02-04"), "CSKH","Lễ tân",20, 25000000D));
                add(new Staff("Cong", "0545661214", "HD", LocalDate.parse("1998-05-06"), "SALE","Saler",3, 10000000D));
                add(new Staff("Duc", "0789564125", "HN", LocalDate.parse("2001-12-14"), "HCNS","CEO",9, 18000000D));
                add(new Staff("Quan", "0789545125", "HN", LocalDate.parse("2001-12-28"), "PRODUCT","Dev",9, 18000000D));
            }
        };

        System.out.println(staffs);
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        Map<String, List<Staff>> company = new HashMap<>();
        staffs.forEach(staff -> {
            List<Staff> departmentClass = company.get(staff.getDepartment());
            if (departmentClass == null) {
                departmentClass = new ArrayList<Staff>() {
                    {
                        add(staff);
                    }
                };
            } else {
                departmentClass.add(staff);
            }
            company.put(staff.getDepartment(), departmentClass);
        });
        System.out.println("danh sach nhan vien phong hanh chinh nhan su :");
        System.out.println(company.get("HCNS"));
        System.out.println("danh sach nhan vien cham soc khach hang :");
        System.out.println(company.get("CSKH"));
        System.out.println("danh sach nhan vien phong sale :");
        System.out.println(company.get("SALE"));
        System.out.println("danh sach nhan vien phong ban dieu hanh :");
        System.out.println(company.get("BOD"));
        System.out.println("danh sach nhan vien phong san xuat :");
        System.out.println(company.get("PRODUCT"));
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap name department");
        String n = sc.nextLine();
        Collections.sort(company.get(n), new Comparator<Staff>() {
            @Override
            public int compare(Staff o1, Staff o2) {
                return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
            }

        });


        System.out.println("sau khi sắp xếp : ");
        System.out.println(company.get(n));
        System.out.println("-----------------------------");
        System.out.println("Danh sach nhan vien sinh nhat trong cung tuan la: ");
        for (Staff staff3 : staffs) {
            List<Staff> employeeDepartment1 = company.get(staff3.getDateOfBirth());
            
            System.out.println("tên : " + staff3.getName());
        }
        System.out.println("-----------------------------");
        System.out.println("Danh sách nhân viên sau khi tăng lương cơ bản");

        for (Staff staff2 : staffs) {
            List<Staff> employeeDepartment = company.get(staff2.getDepartment());
            staff2.setBasicSalary(staff2.getBasicSalary() + staff2.getBasicSalary() * 0.1 / employeeDepartment.size());
            System.out.println("tên : " + staff2.getName() + ", phong ban : " + staff2.getDepartment() + ", muc luong : " + staff2.getBasicSalary());
        }

        System.out.println("-----------------------------");

        int vacationDay;
        for (Staff staff : staffs) {
            if (2 > staff.getSeniority()) {
                vacationDay = 0;
                System.out.println("tên : " + staff.getName() + ", dia chi : " + staff.getAddress() + ", so dien thoai : " + staff.getSdt() + ", ngay sinh : " + staff.getDateOfBirth() + ", phong ban : " + staff.getDepartment() + ", vi tri : " + staff.getViTri() + ", tham nien : " + staff.getSeniority() + ", muc luong : " + staff.getBasicSalary() + ", ngay nghi : " + vacationDay);
            } else if (2 < staff.getSeniority() && 3 >= staff.getSeniority()) {
                vacationDay = 13;
                System.out.println("tên : " + staff.getName() + ", dia chi : " + staff.getAddress() + ", so dien thoai : " + staff.getSdt() + ", ngay sinh : " + staff.getDateOfBirth() + ", phong ban : " + staff.getDepartment() + ", vi tri : " + staff.getViTri() + ", tham nien : " + staff.getSeniority() + ", muc luong : " + staff.getBasicSalary() + ", ngay nghi : " + vacationDay);
            } else if (3 < staff.getSeniority() && 5 >= staff.getSeniority()) {
                vacationDay = 15;
                System.out.println("tên : " + staff.getName() + ", dia chi : " + staff.getAddress() + ", so dien thoai : " + staff.getSdt() + ", ngay sinh : " + staff.getDateOfBirth() + ", phong ban : " + staff.getDepartment() + ", vi tri : " + staff.getViTri() + ", tham nien : " + staff.getSeniority() + ", muc luong : " + staff.getBasicSalary() + ", ngay nghi : " + vacationDay);
            } else if (5 < staff.getSeniority() && 10 >= staff.getSeniority()) {
                vacationDay = 18;
                System.out.println("tên : " + staff.getName() + ", dia chi : " + staff.getAddress() + ", so dien thoai : " + staff.getSdt() + ", ngay sinh : " + staff.getDateOfBirth() + ", phong ban : " + staff.getDepartment() + ", vi tri : " + staff.getViTri() + ", tham nien : " + staff.getSeniority() + ", muc luong : " + staff.getBasicSalary() + ", ngay nghi : " + vacationDay);
            } else {
                vacationDay = 23;
                System.out.println("tên : " + staff.getName() + ", dia chi : " + staff.getAddress() + ", so dien thoai : " + staff.getSdt() + ", ngay sinh : " + staff.getDateOfBirth() + ", phong ban : " + staff.getDepartment() + ", vi tri : " + staff.getViTri() + ", tham nien : " + staff.getSeniority() + ", muc luong : " + staff.getBasicSalary() + ", ngay nghi : " + vacationDay);
            }
        }

    }
}

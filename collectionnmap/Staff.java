package collectionnmap;

import java.time.LocalDate;

public class Staff {
    private String name;
    private String sdt;
    private String address;
    private LocalDate dateOfBirth;
    private String department;
    private String viTri;
    private int seniority;
    private double basicSalary;

    public Staff() {
    }

    public Staff(String name, String sdt, String address, LocalDate dateOfBirth, String department, String viTri, int seniority, double basicSalary) {
        this.name = name;
        this.sdt = sdt;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.viTri = viTri;
        this.seniority = seniority;
        this.basicSalary = basicSalary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    @Override
    public String toString() {
        return "name = " +this.name + ", SDT =  " + this.sdt + ", Dia Chi: " + this.address
                + ", ngay sinh: " + this.dateOfBirth + ", Phong Ban =  " + this.department + ", Vi tri =  " + this.viTri
                + ", seniority =  " + this.seniority + ", basic salary =  " + this.basicSalary + "\n";
    }
}

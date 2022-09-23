package collectionnmap;
import collectionhomework.Student;

import java.util.ArrayList;

public class ListOfStaff {
    private ArrayList<Staff> staffArrayList;

    public ListOfStaff(ArrayList<Staff> staffArrayList) {
        this.staffArrayList = staffArrayList;
    }

    public ListOfStaff() {
        this.staffArrayList = new ArrayList<Staff>();
    }
    public void addStaff(Staff staff) {
        this.staffArrayList.add(staff);
    }

}


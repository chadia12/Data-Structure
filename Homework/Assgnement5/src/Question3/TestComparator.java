package Question3;


import java.util.ArrayList;
import java.util.Collections;

public class TestComparator {
    public static void main(String[] args) {
        StudentComparator std1 = new StudentComparator(11, "Keza", 90);
        StudentComparator std2 = new StudentComparator(12, "Ivannia", 60);
        StudentComparator std3 = new StudentComparator(13, "Talitha", 78);
        StudentComparator std4 = new StudentComparator(14, "Chadia", 89);
        ComparatorStudent compst = new ComparatorStudent();

        System.out.println(std1.equals(std2));
        ArrayList<StudentComparator> stdList = new ArrayList<>();
        stdList.add(std1);
        stdList.add(std2);
        stdList.add(std3);
        stdList.add(std4);

        System.out.println(stdList);
       Collections.sort(stdList, compst);
        System.out.println(stdList);

    }
}

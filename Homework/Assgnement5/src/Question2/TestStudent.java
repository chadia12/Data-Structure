package Question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args) {
        Student std1 = new Student(11, "Bella", 90);
        Student std2 = new Student(12, "Towdah", 60);
        Student std3 = new Student(13, "Talitha", 78);
        Student std4 = new Student(14, "chadia", 89);
        ArrayList<Student> stdList = new ArrayList<>();
        stdList.add(std1);
        stdList.add(std2);
        stdList.add(std3);
        stdList.add(std4);
        System.out.println(stdList);
        Collections.sort(stdList);
        System.out.println(stdList);
    }
}

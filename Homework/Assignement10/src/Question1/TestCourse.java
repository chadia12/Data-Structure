package Question1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("CS221","Java",40);
        Course course2 = new Course("CS220","DataBase",50);
        Course course3 = new Course("CS223","C++",60);

        List<Course> cslist = new ArrayList<>();
        cslist.add(course1);
        cslist.add(course2);
        cslist.add(course3);
        System.out.println(cslist);


    }
    public static Map diplaycourse(List crs){
        Map<String, Course> map1 = new HashMap<>();
        for(Object s: crs){
            Course obj = (Course) s;
            map1.put(obj.getcID() ,obj);
        }
        return map1;
    }
}

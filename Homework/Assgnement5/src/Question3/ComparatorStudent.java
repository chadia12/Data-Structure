package Question3;

import java.util.Comparator;

public class ComparatorStudent implements Comparator<StudentComparator> {
    @Override
    public int compare(StudentComparator o1, StudentComparator o2) {
        String name1 = o1.getSname();
        String name2 = o2.getSname();
        int score1 = o1.getScore();
        int score2 = o2.getScore();
        if(name1.compareTo(name2) != 0){
            return name1.compareTo(name2);
        }
        return (score1 - score2) ;
    }


}

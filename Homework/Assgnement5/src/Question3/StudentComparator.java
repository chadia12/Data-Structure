package Question3;

import java.util.Comparator;
import java.util.Objects;

public class StudentComparator  {
  private  int sid;
  private  String sname;
   private int score;
   public StudentComparator(int sid, String sname, int score){
       this.sid = sid;
       this.sname = sname;
       this.score = score;
   }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof StudentComparator)) return false;
        StudentComparator stdo = (StudentComparator) obj;
        return sid == stdo.sid && score == stdo.score && sname.equals(stdo.sname);
    }

    public String getSname() {
        return sname;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return + sid + " " + sname + " " + score ;
    }


}

package Question2;

public class Student implements Comparable<Student>{
  private  int sid;
  private  String sname;
   private int score;
   public Student(int sid, String sname, int score){
       this.sid = sid;
       this.sname = sname;
       this.score = score;
   }

    @Override
    public int compareTo(Student o) {
        return (this.score - o.score);
//Student st = (Student) o;
//        return Integer.compare( this.score, st.score) ;

    }

    @Override
    public String toString() {
        return + sid + " " + sname + " " + score ;
    }
}

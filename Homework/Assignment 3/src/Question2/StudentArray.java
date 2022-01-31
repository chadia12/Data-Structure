package Question2;

import java.util.Arrays;

public class StudentArray {
    private Student[] a;
    private int nElems =0 ;



    public StudentArray(int max){
       a= new Student[max];
    }
    public Student find(int id){
        if(id <0 || id >=a.length)
            throw new ArrayIndexOutOfBoundsException();
        return a[id];
    }
    public void insert(int id,String name, int mark) {

        Student a1 = new Student(id, name, mark);
        int count = 0;
        if (a[0] == null) {
            a[nElems] = a1;
            nElems++;
        } else {
            for (int i = 0; i < nElems; i++) {
                if(id == a[i].getId()){
                    count++;
                }
            }
            if(count <= 0){
            a[nElems] = a1;
            nElems++;
         }
      }
    }
    public boolean delete(int id){
        if(id <0 || id >=a.length)
            throw new ArrayIndexOutOfBoundsException();
        for (int i = 0; i <a.length ; i++) {
a[i] = a[i+1];
i--;

        }
     return true;
    }

    public void displayAll(){
        for (int i = 0; i <nElems ; i++) {
            a[i].displayStudent();
        }
    }
    public Student maximum1(){
       int max = 0;
       Student s1= a[0];
        for (int i = 0; i < a.length; i++) {
            if( a[i].getMark() > max ) {
                max = a[i].getMark();
                s1= a[i];
            }
        }
        System.out.println("the student who has maximum mark is: "+ s1.getId()+ " " +s1.getName()+ " "+s1.getMark());
        return s1;
    }
    public Student minimum(){

        Student s2 = a[0];
        int min=a[0].getMark();
        for(int i=0; i<a.length; i++){

            if(a[i].getMark() < min){
                s2 = a[i];
            }
        }
        System.out.println("\nthe student who has minimum mark is :" + s2.getId() + " "+ s2.getName()+ "  " + s2.getMark());
        return s2 ;
    }

    public static void main(String[] args) {
        StudentArray std = new StudentArray(3);
        std.insert(1,"chadia",98);
        std.insert(2,"Sharif",90);
        std.insert(3,"Tehillah",80);

        std.displayAll();
        std.maximum1();
        std.minimum();

    }
}

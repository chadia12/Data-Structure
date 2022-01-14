package Question2;

public class Student {
    private int id;
    private String name;
    private int mark;
    public Student() {

    }

    public Student(int id, String name, int mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }
    public int getId() {
        return id;
    }

    public int getMark() {
        return mark;
    }

    public String getName() {
        return name;
    }
    public void displayStudent(){
        System.out.println("Id: "+this.id +" name: "+ this.name + " mark: " + this.mark);
    }


}

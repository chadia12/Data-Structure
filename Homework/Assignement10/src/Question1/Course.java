package Question1;

public class Course {
    private String cID;
    private String cName;
    private int creditHours;

    public Course(String cID, String cName, int creditHours) {
        this.cID = cID;
        this.cName = cName;
        this.creditHours = creditHours;
    }

    public String getcID() {
        return cID;
    }

    @Override
    public String toString() {
        return "cID='" + cID + " " +
                ", cName='" + cName + " " +
                ", creditHours=" + creditHours;
    }
}

package Question3;

public class Marketing {
    private String employeename;
    private String productname;
    private int salesamount;
    public Marketing(String employeename, String productname, int salesamount ){
        this.employeename = employeename;
        this.productname = productname;
        this.salesamount = salesamount;
    }

    public String getEmployeename() {
        return employeename;
    }

    public String getProductname() {
        return productname;
    }

    public int getSalesamount() {
        return salesamount;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public void setSalesamount(int salesamount) {
        this.salesamount = salesamount;
    }

    @Override
    public String toString() {
        return "[" + employeename + " " + productname + " " + salesamount +
                ']';
    }
}

package Lab7;

public class TypeEmployee {
    private String type;
    private double salary;

    public TypeEmployee() {
    }

    public TypeEmployee(String type, double salary) {
        this.type = type;
        this.salary = salary;
    }

    public String getType() {
        return type;
    }

    public double getSalary() {
        return salary;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}

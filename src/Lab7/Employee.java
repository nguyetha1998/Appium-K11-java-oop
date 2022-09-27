package Lab7;

import java.util.List;

public class Employee {

    private int id;
    private String name;

    private TypeEmployee typeEmployee;

    public Employee() {
    }

    public Employee(int id, String name, TypeEmployee typeEmployee) {
        this.id = id;
        this.name = name;
        this.typeEmployee = typeEmployee;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeEmployee getTypeEmployee() {
        return typeEmployee;
    }

    public void setTypeEmployee(TypeEmployee typeEmployee) {
        this.typeEmployee = typeEmployee;
    }
}

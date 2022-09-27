package Lab7;

import java.util.ArrayList;
import java.util.List;


public class CalculatorSalary {
    public static int totalSalary(List<Employee> listEmployee) {
        int total = 0;
        for (Employee employee : listEmployee) {
            total += employee.getTypeEmployee().getSalary();
        }
        return total;
    }


    public static void main(String[] args) {
        List<Employee> listEmployee = new ArrayList<>();
        TypeEmployee typeFTE = new TypeEmployee("FTE", 50000);
        TypeEmployee typeContract = new TypeEmployee("Contract", 40000);
        TypeEmployee typeB = new TypeEmployee("B", 30000);
        Employee employee1 = new Employee(1, "Nguyễn văn A", typeFTE);
        Employee employee2 = new Employee(2, "Nguyễn văn B", typeFTE);
        Employee employee3 = new Employee(3, "Nguyễn văn C", typeFTE);
        Employee employee4 = new Employee(4, "Nguyễn văn D", typeContract);
        Employee employee5 = new Employee(5, "Nguyễn văn E", typeContract);
        Employee employee6 = new Employee(6, "Nguyễn văn G", typeB);
        listEmployee.add(employee1);
        listEmployee.add(employee2);
        listEmployee.add(employee3);
        listEmployee.add(employee4);
        listEmployee.add(employee5);
        listEmployee.add(employee6);
        System.out.println("Total salary of company is: " + totalSalary(listEmployee));
    }
}

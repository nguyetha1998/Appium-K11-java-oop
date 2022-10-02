package Lab8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TotalSalary {
        public static int totalSalary(List<Employee> listEmployee) {
            int total = 0;
            for (Employee employee : listEmployee) {
                total += employee.getSalary();
            }
            return total;
        }

        public static List<Employee> generateEmp(int total, String typeEmployee) {
            List<Employee> listEmp = new ArrayList<>();
            for (int i = 0; i < total; i++) {
                if (typeEmployee.equals("FTE") ){
                    listEmp.add(new FullTimeEmployee());
                } else if (typeEmployee.equals("CTE")) {
                    listEmp.add(new ContractEmployee());
                }
            }
            return listEmp;
        }

        public static void main(String[] args) {
            List<Employee> listEmployee = new ArrayList<>();
            System.out.println("Please enter number of FTE: ");
            Scanner sc = new Scanner(System.in);
            int numberFTE = sc.nextInt();
            System.out.println("Please enter number of CTE: ");
            Scanner sc1 = new Scanner(System.in);
            int numberCTE = sc1.nextInt();
            List<Employee> listFTE = generateEmp(numberFTE, "FTE");
            List<Employee> listCTE = generateEmp(numberCTE, "CTE");

            System.out.println("The total salary of FTE is: " + totalSalary(listFTE));
            System.out.println("The total salary of CTE is: " + totalSalary(listCTE));


        }

}

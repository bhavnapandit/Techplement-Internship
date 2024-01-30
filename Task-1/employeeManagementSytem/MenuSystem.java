package employeeManagementSytem;

import java.util.Scanner;
import employeeManagementSytem.ManagementArea;

public class MenuSystem {
    
    public static void allEmployees() {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("Press 1. Employee Area\n"
                    + "press 2. Management Area\n"
                    + "press 3. To quit");
            System.out.println("----x----x----");
            System.out.println("Enter your choice!!");
            System.out.println("----x----x----");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    EmployeeArea.employeeOperations();
                    break;
                case 2:
                    ManagementArea.ManagementOperation();
                    break;
                case 3:
                    System.exit(0);
            }
        }

    }

    public static void main(String[] args) {

        System.out.println("~~~Employee Mangement System~~~");
        allEmployees();
    }
}

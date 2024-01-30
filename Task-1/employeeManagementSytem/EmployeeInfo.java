package employeeManagementSytem;

import java.util.Scanner;

public class EmployeeInfo {

    static final int MAX_EmployeeS = 100;
    static int employeeCount = 0; // Number of Employees currently stored

    static Employee[] Employees = new Employee[MAX_EmployeeS];

    static Scanner sc = new Scanner(System.in);

    static void addEmployeeProfile(Employee Employee) {
        Employees[employeeCount++] = Employee;
        System.out.println("Employees profile is sucessfully added!!!");
    }

    static void serachEmployeeProfile() {
        System.out.println("Enter the Employee ID:");
        int id = sc.nextInt();
        boolean check = false;
        for (int i = 0; i < employeeCount; i++) {
            if (Employees[i].getId() == id) {
                check = true;
                System.out.println("Employee record you were looking for:");
                System.out.println("----x----x----");
                System.out.println("Employee name:" + Employees[i].getName());
                System.out.println("Employee Id:" + Employees[i].getId());
                System.out.println("Employee age:" + Employees[i].getAge());
                System.out.println("Employee grade:" + Employees[i].getAddress());
                System.out.println("Employee salart:" + Employees[i].getSalary());
                System.out.println("Employee department:" + Employees[i].getDepartment());
                break;
            }
        }
        if (check == false) {
            System.out.println("Employee is not registered yet in the system");
        }
    }

    public static void modifyEmployeeInfo() {
        System.out.print("Enter employee ID to update: ");
        int updateId = sc.nextInt();
        for (int i = 0; i < employeeCount; i++) {
            if (Employees[i].getId() == updateId) {

                System.out.println("Enter Employee id:");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter Employee name:");
                String name = sc.nextLine();

                System.out.println("Enter Employee age:");
                int age = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter Employee address:");
                String address = sc.nextLine();

                System.out.println("Enter Employee salary:");
                Double salary = sc.nextDouble();
                sc.nextLine();

                System.out.println("Enter Employee department:");
                String department = sc.nextLine();

                Employees[i].setId(id);
                Employees[i].setName(name);
                Employees[i].setAge(age);
                Employees[i].setAddress(address);
                Employees[i].setSalary(salary);
                Employees[i].setDepartment(department);
                
                return;
            }
        }
        System.out.println("No such employee found!");
    }

    public static void getByDepartment(){
        System.out.print("Enter Department Name : ");
        String department= sc.nextLine();
        for (int i = 0; i < employeeCount; i++) {
            if (Employees[i] != null && Employees[i].getDepartment().equals(department)) {
                Employees[i] = Employees[i + 1];
                employeeCount--;
                break;
            }

            if (i == Employees.length - 1) {
                System.out.println("That requested person is not admitted  at this company.");
            }
        }
    }

    public static void deactivateEmployeeprofile() {
        sc.nextLine();
        System.out.println("Enter the  name of the Employee you want to delete from the list");
        String name = sc.nextLine();
        for (int i = 0; i < employeeCount; i++) {
            if (Employees[i] != null && Employees[i].getName().equals(name)) {
                Employees[i] = Employees[i + 1];
                employeeCount--;
                break;
            }

            if (i == Employees.length - 1) {
                System.out.println("That requested person is not admitted  at this school.");
            }
        }
    }

    public static void displayEmployeeProfile() {
        if (employeeCount == 0) {
            System.out.println("No Employees found.");
            return;
        }

        System.out.println("\nEmployee Records:");
        for (int i = 0; i < employeeCount; i++) {
            System.out.println("----x----x----");
            System.out.println("Employee name:" + Employees[i].getName());
            System.out.println("Employee Id:" + Employees[i].getId());
            System.out.println("Employee age:" + Employees[i].getAge());
            System.out.println("Employee grade:" + Employees[i].getAddress());
            System.out.println("Employee salary:" + Employees[i].getSalary());
            System.out.println("Employee department:" + Employees[i].getDepartment());
            System.out.println("----x----x----");
        }
    }
}

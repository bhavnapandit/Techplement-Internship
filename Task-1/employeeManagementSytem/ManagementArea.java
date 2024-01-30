package employeeManagementSytem;


import java.util.Scanner;

public class ManagementArea {
    static Scanner sc=new Scanner(System.in);
    static Employee createEmployeeProfile(){
		
        System.out.println("Enter Employee id:");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Employee name:");
		String name=sc.nextLine();
		
		System.out.println("Enter Employee age:");
		int age=sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Employee address:");
		String address=sc.nextLine();
		
		System.out.println("Enter Employee salary:");
		Double salary=sc.nextDouble();
		sc.nextLine();

		System.out.println("Enter Employee department:");
		String department=sc.nextLine();
		
        return new Employee( id,name,age,address,salary,department);
    }

     static void ManagementOperation() {
        int choice;
		while(true) {
		System.out.println("Press 1. Add Employee profile\n"
		+"Press 2. Deactivate Employee profile\nPress 3. Display Employee information\n"
				+"Press 4. Search Employee information\n"
				+ "Press 5. Get Employee according to department \n"
				+"Press 6. Go back to the menu system\n"
				);
		
		System.out.println("----x----x----");
		System.out.println("Enter your choice!!");
		System.out.println("----x----x----");
		choice =sc.nextInt();
		
		switch(choice) {
		case 1:
            Employee s=createEmployeeProfile();
            EmployeeInfo.addEmployeeProfile(s);
			break;
		case 2:
		    EmployeeInfo.deactivateEmployeeprofile();
			break;
		case 3:
            EmployeeInfo.displayEmployeeProfile();
			break;
		case 4:
			EmployeeInfo.serachEmployeeProfile();
			break;
		case 5:
		    EmployeeInfo.getByDepartment();
		case 6:
		MenuSystem.allEmployees();
		 break;
		
		}
		}
        
    }
}

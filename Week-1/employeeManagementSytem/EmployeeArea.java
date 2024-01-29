package employeeManagementSytem;

import java.util.Scanner;
public class EmployeeArea {
	 
	
    static Scanner sc=new Scanner(System.in);
	
	

    static void employeeOperations(){
         int choice;
		while(true) {
		System.out.println("Press 1. View Your profile \n"
		+"Press 2: Update Your profile \n"
		+"Press 3.Return to MainMenu \n"
				);
		
		System.out.println("----x----x----");
		System.out.println("Enter your choice!!");
		System.out.println("----x----x----");
		choice =sc.nextInt();
		
		switch(choice) {
		case 1:
            EmployeeInfo.serachEmployeeProfile();;
			break;
		case 2:
		   EmployeeInfo.modifyEmployeeInfo();;
			break;
		case 3:
		   MenuSystem.allEmployees();;
		 break;
		
		}
		}
        
    }
    }


import java.util.Scanner;
public class EmployeeTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee aEmployee = new Employee();
		System.out.println("Please Employee Name: ");
		aEmployee.name = sc.next();
		System.out.println("Please Employee Salary: ");
		aEmployee.salary = sc.nextLong();
		
		Manager aManager = new Manager();
		System.out.println("Please Enter Manager Name: ");
		aManager.name = sc.next();
		System.out.println("Please Enter Manager Salary: ");
		aManager.salary = sc.nextLong();
		System.out.println("Please Enter Manager Dept: ");
		aManager.dept = sc.next();
		
		Executive aExecutive = new Executive();
		System.out.println("Please Enter Executive Manager Name: ");
		aExecutive.name = sc.next();
		System.out.println("Please Enter Executive Manager Salary: ");
		aExecutive.salary = sc.nextLong();
		System.out.println("Please Enter Executive Manager Dept: ");
		aExecutive.dept = sc.next();
		System.out.println("Please Enter Executive Manager Yearly Bonus: ");
		aExecutive.yearlyBonus = sc.nextLong();
		
		System.out.println(aEmployee);
		System.out.println(aManager);
		System.out.println(aExecutive);
		
	}

}






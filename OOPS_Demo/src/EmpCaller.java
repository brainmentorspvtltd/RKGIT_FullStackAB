import java.util.Scanner;

public class EmpCaller {

	public static void main(String[] args) {
		
		// will call default constructor
		//Employee ram = new Employee();
		
		MessageReader mr = new MessageReader();
		
		System.out.println(mr.getKey("welcomeMsg"));
		
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter Emp ID : ");
		System.out.println(mr.getKey("input.id"));
		int empId = scanner.nextInt();
		
		scanner.nextLine();
		
		//System.out.println("Enter Emp Name : ");
		System.out.println(mr.getKey("input.name"));
		String name = scanner.nextLine();
		
		//System.out.println("Enter Emp Dept : ");
		System.out.println(mr.getKey("input.dept"));
		String dept = scanner.nextLine();
		
		//System.out.println("Enter Emp Salary : ");
		System.out.println(mr.getKey("input.salary"));
		double salary = scanner.nextDouble();
		
		
		Employee ram = new Employee(empId, name, dept, salary);
		//ram.takeInput(101, "Ram", "IT", 45000.00);
//		ram.showDetails();
		// will always print hash code
		System.out.println(ram);
		//System.out.println(ram.toString());
		
		System.out.println("==========================");
		
		//Employee shyam = new Employee();
		Employee shyam = new Employee(102, "Shyam", "HR", 50000.00);
		//shyam.takeInput(102, "Shyam", "HR", 50000.00);
		//shyam.salary = -5000;
//		shyam.showDetails();
//		System.out.println(shyam.getSalary());
		System.out.println(shyam);
		shyam.setSalary(shyam.getSalary() + 5000);
		System.out.println("Updated Salary : " + shyam.getSalary());
		
		scanner.close();
		
	}

}

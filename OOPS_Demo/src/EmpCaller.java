public class EmpCaller {

	public static void main(String[] args) {
		
		// will call default constructor
		//Employee ram = new Employee();
		
		Employee ram = new Employee(101, "Ram", "IT", 45000.00);
		//ram.takeInput(101, "Ram", "IT", 45000.00);
//		ram.showDetails();
		// will always print hash code
		System.out.println(ram);
		//System.out.println(ram.toString());
		
		//Employee shyam = new Employee();
		Employee shyam = new Employee(102, "Shyam", "HR", 50000.00);
		//shyam.takeInput(102, "Shyam", "HR", 50000.00);
		//shyam.salary = -5000;
//		shyam.showDetails();
//		System.out.println(shyam.getSalary());
		System.out.println(shyam);
		shyam.setSalary(shyam.getSalary() + 5000);
		System.out.println("Updated Salary : " + shyam.getSalary());
		
	}

}

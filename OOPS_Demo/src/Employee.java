//Encapsulation
//- wrapping of data into one single unit known as class
//- wrapping of data members and methods
//Data Hiding - make variables private and methods public

//Good Encapsulation - Encapsulation + Data Hiding
//Getter and Setter

public class Employee extends Object {
	private int id;
	private String name;
	private String dept;
	private double salary;
	private String company;
	private String location;
	
	// Default Constructor
	// constructor will never be private
	// because we are going to call it from different class
	// it returns nothing, it's not a method
	// we use constructor to initialize variables
	public Employee() {
		System.out.println("Default Const. Called...");
		this.company = "Brain Mentors Pvt Ltd";
	}
	
	public Employee(String location) {
		this();
		this.location = location;
	}
	
	// Parameterized Constructor
	public Employee(int id, String name, String dept, double salary) {
		// Constructor Chaining
		//this();		// will call default constructor
		this("Delhi");
		System.out.println("Param Const. Called...");
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary < 0) {
			return;
		}
		else {
			this.salary = salary;
		}		
	}

	public String getCompany() {
		return company;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	// Earnings
	public double getHRA() {
		return this.salary * 0.30;
	}
	public double getTA() {
		return this.salary * 0.20;
	}
	public double getMA() {
		return this.salary * 0.15;
	}
	public double getDA() {
		return this.salary * 0.35;
	}
	
	// Deductions
	public double getTDS() {
		return this.salary * 0.10;
	}
	public double getPF() {
		return this.salary * 0.05;
	}
	
	public double netSalary() {
		double earning = this.salary + getHRA() + getDA() + getMA() + getTA();
		double deduction = getTDS() + getPF();
		double net = earning - deduction;
		return net;
	}
	
	@Override
	public String toString() {
		CommonUtils utils = new CommonUtils();
		this.name = utils.formatName(name);
		this.salary = netSalary();
		return this.company + 
				"\n" + this.name + 
				"\n" + this.salary;
	}
	
}

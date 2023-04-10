import static java.lang.System.out;

class Customer {
	static int auto_increment;
	int id = 0;
	String name;
	String dept;
	// Static Block
	static {
		auto_increment = 0;
		System.out.println("Static Block Executed...");
		
	}
	
	// Init Block
	{
		//String dept = "IT";
		System.out.println("Init block executed...");
	}
	
	// Const Block
	public Customer(String name, String dept) {
		System.out.println("Const. Called...");
		auto_increment++;
		this.id = auto_increment;
		this.name = name;
		this.dept = dept;
	}
}

public class StaticKeyword {

	public static void main(String[] args) {
		
		Customer obj = new Customer("Ram", "IT");
		out.println(obj.id);
		out.println(obj.name);
		out.println(obj.dept);
		
		Customer obj_2 = new Customer("Shyam", "IT");
		System.out.println(obj_2.id);
		System.out.println(obj_2.name);
		System.out.println(obj_2.dept);
		
		System.out.println(obj.id);

	}

}

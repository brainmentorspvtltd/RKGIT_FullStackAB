class A {
	int x;
	A() {
		x = 10;
		System.out.println("A Class Default Const...");
	}
	A(int x) {
		this();
		System.out.println("A Class Param Const...");
	}
}

class B extends A {
	int x;
	B() {
		//super();	// super is already written in our const...
		// super will call parent class const...
		super(100);	 // will call A class param const...
		System.out.println("B Class Default Const...");
		x = 20;
	}
	B(int x) {
		this();	// will call current class default const...
		System.out.println("B Class Param Const...");
		// local variable + instance variable + parent class variable
		int total = x + this.x + super.x;
		System.out.println("Total is : " + total);
	}
}

public class SuperVsThis {

	public static void main(String[] args) {
//		B obj = new B();
		B obj = new B(50);
	}

}

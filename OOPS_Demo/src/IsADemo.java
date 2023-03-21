class Account {
	int acc_no;
	String name;
	double balance;
	void withdraw() {
		System.out.println("Withdraw Limit is : 1 Lac");
	}
	void deposit() {
		System.out.println("Deposit Limit is : 2 Lac");
	}
}

class SavingAccount extends Account {
	@Override
	void withdraw() {
		System.out.println("SA withdraw limit is 2 Lac");
	}
	void roi() {
		System.out.println("ROI is 4.5%");
	}
}

class CurrentAccount extends Account {
	void od_limit() {
		System.out.println("OD limit is 50K");
	}
	@Override
	void deposit() {
		System.out.println("CA Deposit limit is 50K");
	}
}

public class IsADemo {
	
	// polymorphic call
	void caller(Account acc) {
		acc.deposit();
		acc.withdraw();
		// Downcasting
		if(acc instanceof SavingAccount) {
			SavingAccount sa = (SavingAccount)acc;
			sa.roi();
			//((SavingAccount) acc).roi();
		}
		else if(acc instanceof CurrentAccount) {
			CurrentAccount ca = (CurrentAccount)acc;
			ca.od_limit();
		}
	}

	public static void main(String[] args) {
//		SavingAccount sa = new SavingAccount();
//		sa.deposit();	// parent class
//		sa.withdraw();	// child class (because of overriding)
//		sa.roi();		// child class (self method)
//		
//		CurrentAccount ca = new CurrentAccount();
//		ca.deposit();	// child class	(because of overriding)
//		ca.withdraw();	// parent class
//		ca.od_limit();	// child class (self method)
		
		// Upcasting
		// object of child class but type is parent class
//		Account acc = new SavingAccount();
//		acc.deposit();	// parent class
//		acc.withdraw();	// child class (because of overriding)
//		//acc.roi();		// child class (self method)
//		
//		acc = new CurrentAccount();
//		acc.deposit();	// child class	(because of overriding)
//		acc.withdraw();	// parent class
		//acc.od_limit();	// child class (self method)
		
		IsADemo obj = new IsADemo();
		obj.caller(new SavingAccount());	// upcasting
		obj.caller(new CurrentAccount());	// upcasting
		
		
	}

}







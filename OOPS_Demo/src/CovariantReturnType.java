class SimpleUser {
	
}

class PrimeUser extends SimpleUser {
	
}

class SimpleLogin {
	SimpleUser doLogin() {
		SimpleUser obj = new SimpleUser();
		return obj;
	}
}

class PrimeLogin extends SimpleLogin {
	@Override
	PrimeUser doLogin() {
		PrimeUser obj = new PrimeUser();
		return obj;
	}
}

public class CovariantReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

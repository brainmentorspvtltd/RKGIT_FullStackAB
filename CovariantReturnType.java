class SimpleUser {
	int calc() {
		return 0;
	}
}

class PrimeUser extends SimpleUser {
	@Override
	int calc() {
		return 0;
	}
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

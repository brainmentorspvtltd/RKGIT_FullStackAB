class A1 {
	public void show() {
		System.out.println("Show inside A1");
	}
}

class B1 extends A1 {
	@Override
	public void show() {
		System.out.println("Show inside A1");
	}
}


public class WeakerAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

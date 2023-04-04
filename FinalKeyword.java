// we can't inherit final class
//final class P1 {
class P1 {
//	we can't override final methods
//	final void show() {
//		
//	}
	void show() {
		
	}
}

class C1 extends P1 {
	@Override
	void show() {
		
	}
}

public class FinalKeyword {

	public static void main(String[] args) {
		
		// we can't modify final variables
		final double PI = 3.14;
		//PI++;
		//double pi = Math.PI;
		System.out.println();
	}

}

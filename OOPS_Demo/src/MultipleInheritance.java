interface PC1 {
	int x = 10;
	void show();
}

interface PC2 {
	int x = 20;
	void show();
}

interface PC3 extends PC1, PC2 {
	int x = 12;
}

//class X implements PC1, PC2 {
class X implements PC3 {
//	int x = 30;
//	X(int x) {
//		
//	}
	@Override
	public void show() {
		System.out.println(x);
		System.out.println(PC1.x);
		System.out.println(PC2.x);
	}
	
}

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

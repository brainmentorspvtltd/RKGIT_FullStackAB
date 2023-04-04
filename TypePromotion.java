public class TypePromotion {
	
	void show(byte x) {
		System.out.println("Byte X");
	}
	void show(short x) {
		System.out.println("Short X");
	}
//	void show(int x) {
//		System.out.println("Int X");
//	}
//	void show(long x) {
//		System.out.println("Long X");
//	}
//	void show(float x) {
//		System.out.println("Float X");
//	}
//	void show(Integer x) {
//		System.out.println("Integer Wrapper X");
//	}
//	void show(Float x) {
//		System.out.println("Float Wrapper X");
//	}
	void show(int ...x) {
		System.out.println("Int Var Args X");
	}

	public static void main(String[] args) {
		TypePromotion obj = new TypePromotion();
		// will execute int first
		// if int is not available then it goes for
		// type promotion and will execute long
		// Type widening - will execute float if long
		// is not available
		// obj.show(20);
		// obj.show(4,5,6,8,1);
		obj.show((byte)6);	// now it will call byte
		obj.show((short)10); // now it will call short
		
		
		//Autoboxing - Boxing and Unboxing
		
		Integer i = 12;
		int i1 = i;
		
		//Integer i2 = new Integer(i1); // deprecated
		
		byte x = 127;
		x += 1;
		x++;
		System.out.println(x++);
		
		//int x1 = x;
		//byte x2 = x1;
		
	}

}

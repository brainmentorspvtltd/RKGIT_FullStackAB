interface Calc {
	int add(int x, int y);
	int sub(int x, int y);
}

//class MyCalc implements Calc {
//
//	@Override
//	public int add(int x, int y) {
//		return 0;
//	}
//
//	@Override
//	public int sub(int x, int y) {
//		return 0;
//	}
//	
//}

public class InterfaceUseWays {

	public static void main(String[] args) {
		
		Calc obj = new Calc() {
			
			@Override
			public int sub(int x, int y) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int add(int x, int y) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		System.out.println(obj.add(12, 20));
		System.out.println(obj.add(20, 30));
	}

}

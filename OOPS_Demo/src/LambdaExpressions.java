import java.util.ArrayList;

//SAM - Single Abstract Method
@FunctionalInterface
interface CalcP2 {
	int add(int x, int y);
}

public class LambdaExpressions {

	public static void main(String[] args) {
		// Lambda Expression
		//(a,b) - arguments
		//a+b - return
		//CalcP2 obj = (a,b) -> a + b;
		//System.out.println(obj.add(12, 33));
		
		CalcP2 obj = (a,b) -> {
			int z = a + b;
			return z;
		};
		System.out.println(obj.add(12, 12));
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Ram");
		names.add("Shyam");
		names.add("Kunal");
		
		names.forEach(name -> System.out.println(name));
		
	}

}

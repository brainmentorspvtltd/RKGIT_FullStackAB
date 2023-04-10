import java.util.ArrayList;

public class MemoryDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		int i = 0;
		while(true) {
			String obj = new String("Hello");
			list.add(obj);
			i += 1;
			System.out.println("Object : " + i);
		}

	}

}

class GrandParent {
	int x = 10;
}

class Parent extends GrandParent {
	int x = 20;
}

class Son extends Parent {
	int x;
	public Son(int x) {
		this.x = 50;
		int total = x + this.x + super.x + ((GrandParent)(this)).x;
		System.out.println("Total is : " + total);
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Son obj = new Son(100);

	}

}

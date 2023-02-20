class User {
	static int x;	// will be loaded in memory with class

	// instance variable
	int y;		// will be loaded in memory only after we create object of class

	static public void main(String args[]) {
		int y;		// Local variable
		System.out.println("Hello World..." + x);
	}
}
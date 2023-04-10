interface IPlayer {
//	void walk();	// public abstract void walk();
//	void run();
//	void jump();
	void kick();
	void punch();
	default void walk() {
		
	}
	default void run() {
		
	}
	default void jump() {
		
	}
}

//abstract class CommonPlayer implements IPlayer {
//	@Override
//	public void walk() {
//		
//	}
//	@Override
//	public void run() {
//		
//	}
//	@Override
//	public void jump() {
//		
//	}
//}

class Eddy implements IPlayer {

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		
	}
	
}

class Jin implements IPlayer {

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		
		Jin obj = new Jin();
		obj.walk();
		obj.jump();
		obj.run();
		obj.kick();
		obj.punch();

	}

}

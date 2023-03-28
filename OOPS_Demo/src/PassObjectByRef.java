import java.util.Date;
import java.util.Scanner;

class User {
	private String name;
	private String id;
	private String password;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}

class Message {
	String id;
	String msg;
	Date date;
}

class View {
	void doRegister() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Name : ");
		String name = scanner.nextLine();
		
		System.out.println("Enter your ID : ");
		String id = scanner.nextLine();
		
		System.out.println("Enter your Password : ");
		String pwd = scanner.nextLine();
		
		System.out.println("Enter your City : ");
		String city = scanner.nextLine();
		
		User user = new User();
		user.setName(name);
		user.setId(id);
		user.setPassword(pwd);
		user.setCity(city);
		
		DB db = new DB();
		db.doRegister(user);
		
	}
	void doLogin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your ID : ");
		String id = scanner.nextLine();
		
		System.out.println("Enter your Password : ");
		String pwd = scanner.nextLine();
		
		DB db = new DB();
		//String msg = db.checkLogin(id, pwd);
		Message msg = db.checkLogin(id, pwd);
		System.out.println(msg.id);
		System.out.println(msg.date);
		System.out.println(msg.msg);
		
		scanner.close();
	}
}

class DB {
	Message checkLogin(String id, String pwd) {
		//String msg = "";
		Message msg = new Message();
		if(id.equals("101") && pwd.equals("1234")) {
			//msg = "Login Success...";
			msg.msg = "Login Success";
		}
		else {
			//msg = "Login Failed...";
			msg.msg = "Login Failed";
		}
		msg.id = id;
		msg.date = new Date();
		return msg;
	}
	
	void doRegister(User user) {
		
	}
}

public class PassObjectByRef {

	public static void main(String[] args) {
		
		View view = new View();
		view.doLogin();

	}

}

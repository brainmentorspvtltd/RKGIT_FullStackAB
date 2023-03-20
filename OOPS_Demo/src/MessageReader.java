import java.util.ResourceBundle;

public class MessageReader {
	// this file will read .properties file
	ResourceBundle rb;
	public MessageReader() {
		rb = ResourceBundle.getBundle("messages");
		
	}
	public String getKey(String str) {
		return rb.getString(str);
	}
}

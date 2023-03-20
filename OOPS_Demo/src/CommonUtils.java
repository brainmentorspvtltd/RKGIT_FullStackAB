import java.util.Locale;

public class CommonUtils {
	
	//Locale locale = new Locale("en", "IN");
	
	public String formatName(String name) {
		String nameArr[] = name.split(" ");
		String fullName = "";
		for(String n : nameArr) {
			String firstLetter = String.valueOf(n.charAt(0)).toUpperCase();
			String remainingName = n.substring(1).toLowerCase();
			fullName += firstLetter + remainingName + " ";
		}
		return fullName;
	}
	
}

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class CommonUtils {
	
	Locale locale;
	public CommonUtils(String lang, String country) {
		locale = new Locale(lang, country);
	}
	
	public String formatSalary(double salary) {
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		return nf.format(salary);
	}
	
//	public Date formatDate() {
//		Date date = new Date();
//		return date;
//	}
	
	public String formatDate() {
		Date date = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
		String formattedDate = df.format(date);
		return formattedDate;
	}
	
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

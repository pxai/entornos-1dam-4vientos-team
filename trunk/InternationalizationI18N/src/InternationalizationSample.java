import java.text.DateFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * 
 */

/**
 * Shows how to write a program with messages in different languages
 * NOTE: message files (*.properties) must be located in the classpath
 * like a *.class file
 * @author Pello Altadill
 *
 */
public class InternationalizationSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale locale = Locale.getDefault();
		String language = locale.getDisplayLanguage();
		String country = locale.getDisplayCountry();
		Scanner reader = new Scanner(System.in);
		
		String languageCode = System.getProperty("user.language");
		String countryCode = System.getProperty("user.country");
        System.out.println("Lang: " + language + ", country: " + country);
        System.out.println("Lang: " + languageCode + ", country: " + countryCode);
        
        System.out.println("Give me lang code (en, es, eu): ");
        languageCode = reader.nextLine();
        System.out.println("Give me country code (EN, ES, EU): ");
        countryCode = reader.nextLine();
        
        ResourceBundle messages;

        System.out.println("Setting locales to: " + languageCode +"_"+countryCode);
        locale = new Locale(languageCode, countryCode);
        messages = ResourceBundle.getBundle("messages", locale);

        System.out.println(messages.getString("start"));
        System.out.println(messages.getString("hello"));
        System.out.println(messages.getString("end"));
        
        
	}

}

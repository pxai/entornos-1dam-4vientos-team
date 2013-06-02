import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;


/**
 * Shows how to write a program with messages in different languages
 * NOTE: message files (*.properties) must be located in the classpath
 * like a *.class file
 * @author Pello Altadill
 * @greetz fat-free milk drinker
 * http://butterbeliever.com/fat-free-dairy-skim-milk-secrets/
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
		Integer integerNumber = new Integer(160666);
		Double doubleNumber = new Double(1666.42);
	    NumberFormat numberFormatter;
	    DateFormat dateFormatter;
	    Currency currency;
		
		String languageCode = System.getProperty("user.language");
		String countryCode = System.getProperty("user.country");
        System.out.println("Lang: " + language + ", country: " + country);
        System.out.println("Lang: " + languageCode + ", country: " + countryCode);
        
        System.out.println("Give me lang code (en, es, eu): ");
        languageCode = reader.nextLine();
        System.out.println("Give me country code (EN, ES, EU): ");
        countryCode = reader.nextLine();
        
        // Let's show messages in selected language
        ResourceBundle messages;

        System.out.println("Setting locales to: " + languageCode +"_"+countryCode);
        locale = new Locale(languageCode, countryCode);
        messages = ResourceBundle.getBundle("Messages", locale);

        System.out.println(messages.getString("start"));
        System.out.println(messages.getString("hello"));
        System.out.println(messages.getString("end"));
        
	    numberFormatter = NumberFormat.getNumberInstance(locale);
	    dateFormatter = DateFormat.getDateInstance(DateFormat.LONG, locale);
	   // currency = Currency.getInstance(locale);
	    
	    System.out.println("Numbers: " + numberFormatter.format(integerNumber));
	    System.out.println("Number Double: " + numberFormatter.format(doubleNumber));

	    //numberFormatter = NumberFormat.getCurrencyInstance(locale);
	    //System.out.println("Currency: " + currency);
	    //System.out.println("Money: " + numberFormatter.format(doubleNumber));
	    
	    // PARAMETERS!!!
	    // For messages with parameters we use MesssageFormat
	    // This will be the param to fill de message
	    Object[] messageParams = {
	    	    "Prince"
	    	};
	    MessageFormat formatter = new MessageFormat("");
	    formatter.setLocale(locale);
	    formatter.applyPattern(messages.getString("name"));
	    System.out.println(formatter.format(messageParams));
        // Format samples: http://docs.oracle.com/javase/7/docs/api/java/text/MessageFormat.html
	    Object[] messageParams2 = {
	    	    "Prince",
	    	    new Integer(45),
	    	    new Date(),
	    	    new Double(3.4)
	    	};
	    formatter = new MessageFormat("");
	    formatter.setLocale(locale);
	    formatter.applyPattern(messages.getString("name2"));
	    System.out.println(formatter.format(messageParams2));
	}

}

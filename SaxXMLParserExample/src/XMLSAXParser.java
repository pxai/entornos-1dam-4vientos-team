import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Simple XML parser using SAX. 
 * SAX is somehow an event-driven parser, instead of loading the whole
 * document in some data structure it discovers elements as it reads the
 * XML file. In this class we can set validation to control if the document
 * follows a DTD or not.
 * In many examples you will see that an inner private class is defined as
 * a extension of the DefaultHandler. In this implementation I tried to
 * develop a simple class.
 * ATTENTION! if you want to get DTD validation errors, when you extend the DefaultHandler
 * you have to add error, faltalError and warning methods
 * @author Pello Altadill
 *
 */
public class XMLSAXParser  extends DefaultHandler  {
	
	private String filename;	// The filename of the XML document
    private boolean validation = true; // If we want validation or not
    private String element = ""; // The element we are looking for
    private boolean found = false;	// A flag to control if element is found or not
	
	/**
	 * constructor
	 * @param filename of XML file to be parsed
	 * @param element we look for
	 */
	public XMLSAXParser (String filename,String element) {
		this.filename = filename;
		this.element = element;
	}
	
	/**
	 * @return the validation
	 */
	public boolean isValidation() {
		return validation;
	}

	/**
	 * @param validation the validation to set
	 */
	public void setValidation(boolean validation) {
		this.validation = validation;
	}

	/**
	 * inits XML parse
	 */
	public void parse () {
        File file = new File(filename);
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		saxParserFactory.setValidating(validation);
	    SAXParser parser;
	    try {
	    	parser = saxParserFactory.newSAXParser();
	    	// I am the handler. Me, myself and I
		    DefaultHandler handler = this;
		    parser.parse(file,handler);
		} catch (ParserConfigurationException e) {
		    System.err.println("ParserConfigurationException" + e); 
		} catch (SAXException e) {
		    System.err.println("SAXException: " + e); 
		} catch (IOException e) {
		    System.err.println("IOException: " + e); 
		} catch (Exception e) {
			System.err.println("Exception: " + e); 
		}

	}
	
    
    /**
     * handles warning 
     * @param e SAXParseException
     */
    public void warning(SAXParseException e) throws SAXException {
    	System.out.println("Warning: " + e); 
    }

    /**
     * handles error in document
     * @param e SAXParseException
     */
    public void error(SAXParseException e) throws SAXException {
    	System.out.println("Error: " + e); 
    }

    /**
     * handles fatal error in document
     * @param e SAXParseException
     */
    public void fatalError(SAXParseException e) throws SAXException {
    	System.out.println("Fatal error: " + e); 
    }

    /**
     * method called when a XML element is found
     * @param uri
     * @param localName
     * @param qName
     * @param attributes
     */
	public void startElement(String uri, String localName,
        String qName, Attributes attributes)
        throws SAXException {
	  // Have we found the element we wanted?
      if (qName.equalsIgnoreCase(element)) {
        found = true;
      }
    }

    /**
     * Method called when characters inside the element are found
     * @param ch[]
     * @param start
     * @param length
     */
    public void characters(char ch[], int start, int length)
        throws SAXException {
    	// Show characters only when we are in the element
    	// we wanted
    	if (found) {
    		System.out.println("ELEMENT found: " + new String(ch, start, length));
    		found = false;
    	}
    }
    
    /**
     * called when whitespaces are found
     */
    public void ignorableWhitespace(char buf[], int offset, int len)
            throws SAXException {
            //System.out.println("white space, ignore it: " + offset + ": " + len);
    }
	
    /**
     * called when parsed document begins
     */
    public void startDocument() throws SAXException {
        System.out.println("Start of document parsing.");
     }

    /**
     * called when parsed document ends
     */
     public void endDocument() throws SAXException {
        System.out.println("End of document parsing");
     }
  
    /**
     * 
     * @param args
     */
    public static void main(String args[]) {
    	XMLSAXParser xmlSaxParser = new XMLSAXParser("properties.xml", "PROPERTY");
    	xmlSaxParser.parse();
    }
}
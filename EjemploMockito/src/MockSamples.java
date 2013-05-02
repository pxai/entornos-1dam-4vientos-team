/**
 * 
 */
import static org.mockito.Mockito.*;

import java.util.List;
/**
 * @author luser
 *
 */
public class MockSamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// We create a mock list using List interface
		// So, this is a false or mocked list
		List mockedList = mock(List.class);
		
		// We add something to the list
		mockedList.add("Example");
		mockedList.add("Another example");

		// This will return null
		System.out.println("Is anything there?: " + mockedList.get(0));
		
		// Now we establish: when we call get(0) on out list we
		// want to return "Pain in the ass"
		when(mockedList.get(0)).thenReturn("Pain in the ass");
		//verify(mockedList).add("Example");
		
		// Now, this will return: "Pain in the ass"
		System.out.println("Let's see: " + mockedList.get(0));
		
		// And this one will return  null
		System.out.println("And what about this: " + mockedList.get(1));
		
	}

}

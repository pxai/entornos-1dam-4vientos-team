import static org.mockito.Mockito.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 */

/**
 * We mock a BufferedReader using mockito
 * @author Pello Xabier Altadill Izura
 *
 */
public class MockFile {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// We create an instance of a false or mocked BufferedReader
		BufferedReader mockBufferedReader = mock(BufferedReader.class);
		
		// Then we stub readLine() function. It will return "747:John:Doe"
		when(mockBufferedReader.readLine()).thenReturn("747:John:Doe");
		
		// We establish that when mocked reader calls close an exception
		// will be thrown
		doThrow(new IOException()).when(mockBufferedReader).close();
		
		// Let's try
		System.out.println("First line: " + mockBufferedReader.readLine());
		
		// Now we close...
		mockBufferedReader.close();
		
		BufferedReader anotherMockReader;
		
		
	}

}

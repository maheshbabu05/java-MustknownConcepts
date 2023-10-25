package FileReadingOperationsTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferreaderTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location ="Filewritertest.txt ";
		FileReader filereading = new FileReader(location);
		
		BufferedReader reading = new BufferedReader (filereading);
		
	String CurrentLine = reading.readLine();
		
		
		System.out.println(CurrentLine);
	}

}

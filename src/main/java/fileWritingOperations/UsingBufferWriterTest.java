package fileWritingOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferWriterTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String Location = "UsingBufferwriterMethod";
		String Content = "BufferWriter-Virate Hit century";
		
		FileWriter filewriter2 = new FileWriter(Location);
		
		BufferedWriter BF1 = new BufferedWriter(filewriter2);
		
		BF1.write(Content);
		BF1.close(); 
		
	}

}

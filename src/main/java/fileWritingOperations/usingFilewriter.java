package fileWritingOperations;

import java.io.FileWriter;
import java.io.IOException;

public class usingFilewriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		// FileLocation
		
		String location="Filewritertest.txt";
		String content ="simple way to learn java";
		
		
		FileWriter filewriter1 = new FileWriter(location);
		filewriter1.write(content);
		filewriter1.close();
	}

}

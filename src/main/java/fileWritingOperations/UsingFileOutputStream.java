package fileWritingOperations;

import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String Location = "UsingFileO/PMethod";
		String Content = "FileOpStream-Virate Hit century&6*(%$###";
		
		
		FileOutputStream fileop = new FileOutputStream(Location);
		
		byte[] writethis =Content.getBytes();
		
		fileop.write(writethis);
		fileop.close();
		
		

	}

}

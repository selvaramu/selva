package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExample {

	public static void main(String[] args) throws IOException {
		try {
		File file=new File("C:\\textfolder\\new .txt");

	    FileReader fr=new FileReader(file);
	   
	    int temp=0;
	    while((temp=fr.read())!=-1) {
	    	System.out.print((char)(temp));
	    }
	    
	}
	   catch(FileNotFoundException e) {
		   e.printStackTrace();
		   System.out.println("file NOT found");
	   }
	}
}

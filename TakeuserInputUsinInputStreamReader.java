package sam;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class TakeuserInputUsinInputStreamReader {

	public static void main(String[] args)throws Exception {
		
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		
		
		FileOutputStream fi=new FileOutputStream("D://demo.txt");
		
		System.out.println("Enter text to enter in File : ");
	     String l=br.readLine();
	     
	     byte[] b=l.getBytes();
	     
	     fi.write(b);
	     fi.close();
	     fi.flush();
	     br.close();
	     ir.close();
		
		System.out.println("SucessFully Written In File");
		
	
	}

}

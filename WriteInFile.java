package sam;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class WriteInFile {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		FileOutputStream fr=new FileOutputStream("D:\\FileHandleingPogram\\sam.txt");
		String s="This first FileHandling Program......!";
		
		byte[] b=s.getBytes();
		fr.write(b);
		System.out.println("Sucessfuly written in file..!");
		fr.close();
		
		
		FileInputStream fi=new FileInputStream("D:\\FileHandleingPogram\\sam.txt");
		int i;
		System.out.println("File Content : ");
		while((i=fi.read())!=-1) {
			System.out.print((char)i);
		}
	}

}

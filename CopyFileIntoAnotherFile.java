package sam;

import java.io.*;
public class CopyFileIntoAnotherFile {

	public static void main(String[] args) {

		try {
			
			FileInputStream fi=new FileInputStream("D://sam.txt");
			FileOutputStream fo=new FileOutputStream("D://copy.txt");
			int i;
			
			while((i=fi.read())!=-1) {
				fo.write(i);
			}
			FileInputStream fi2=new FileInputStream("D://copy.txt");
			int j;
			System.out.println("Copy File COntent: ");
			while((j=fi2.read())!=-1) {
				System.out.print((char)j);
				
			}
			fi.close();
			fo.close();
			fi2.close();
		}
		catch (Exception e) {
			System.err.println(e);
		}
		
	}

}

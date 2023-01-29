package sam;

import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class UsingSequenceInputStreamReadData {

	public static void main(String[] args) {
		
		try {
		FileInputStream fi1=new FileInputStream("D://demo.txt");
		
		FileInputStream fi2=new FileInputStream("D://Demo2.txt");
		
		FileInputStream fi3=new FileInputStream("D://sam.txt");
		
		FileInputStream fi4=new FileInputStream("D://Copy.txt");
		
		Vector<FileInputStream> v=new Vector<>();
		v.add(fi1);
		v.add(fi2);
		v.add(fi3);
		v.add(fi4);
		
		Enumeration<FileInputStream> e=v.elements();
		
		
		
		SequenceInputStream si=new SequenceInputStream(e);
		
		
		int i;
		while((i=si.read())!=-1) {
			System.out.print((char)i);
		}
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

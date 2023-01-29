package sam;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class UsingArrayOutputStream {

	public static void main(String[] args) {
		
		try {
		FileOutputStream fo1=new FileOutputStream("D://task1.txt");
		FileOutputStream fo2=new FileOutputStream("D://task2.txt");
		
		ByteArrayOutputStream bo=new ByteArrayOutputStream();
		String s="sameer is Don..";
		byte[] b=s.getBytes();
		bo.write(b);
		
		bo.writeTo(fo1);
		bo.writeTo(fo2);
		
		fo1.close();
		fo2.close();
		
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

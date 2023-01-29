package sam;

import java.io.ByteArrayInputStream;


public class UsingByteArrayInputStreamReadData {

	public static void main(String[] args) {
		
		try
		{
		//FileInputStream fi=new FileInputStream("D://task1.txt");
		
		byte[] b= {97,'a'};
		
		ByteArrayInputStream bi=new ByteArrayInputStream(b);
		int i;
		while((i=bi.read())!=-1) {
			System.out.println((char)i);
		}
		
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

package sam;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class WriteInFileIsingBufferedOutputStream {

	public static void main(String[] args) throws Exception
	{
		
		FileOutputStream fo=new FileOutputStream("D://Demo2.txt");
		BufferedOutputStream bo=new BufferedOutputStream(fo);
		
		String s="Hello i am writing in file using \nBufferedOutPutStream ";
		
		byte[] b=s.getBytes();
		
		bo.write(b);
		bo.flush();
		bo.close();
		fo.close();
		
		FileInputStream fis=new FileInputStream("D://demo2.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		int i;
		while((i=bis.read())!=-1) {
			System.out.print((char)i);
		}
		bis.close();
		fis.close();
	}

}

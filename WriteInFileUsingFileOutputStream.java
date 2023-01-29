package sam;


import java.io.FileOutputStream;

public class WriteInFileUsingFileOutputStream {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fo=new FileOutputStream("D://sam.txt");
			
			String s="I am write in File Using FileOutputStream";
			byte[] b=s.getBytes();
			fo.write(b);
			fo.flush();
			fo.close();
			System.out.println("Suceesfully written in file");
			
		}
		catch (Exception e) {
			System.err.println(e);
		}
	}

}

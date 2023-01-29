package sam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class TaskFileHandling {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("\nSelect the Option \n"+"\n1.Write Into File"+"\n2.Read The Content of File"+"\n3.Write file Using FileWriter"+"\n4.File READ using FileReader");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1:
			FileOutputStream fr=new FileOutputStream("D:\\FileHandleingPogram\\Sample.txt");
			//System.out.println("\nEnter the Content :");
			String r="Wlecome to sameer In File handling";
			if(r!=null) {
			byte[] b=r.getBytes();
			fr.write(b);
			fr.close();
			System.out.println("\nSucessFully Written in File");
			break;
			}
		case 2:
			FileInputStream fi=new FileInputStream("D:\\FileHandleingPogram\\Sample.txt");
			System.out.println("\nFile Content :\n");
			int i;
			while((i=fi.read())!=-1) {
				System.out.print((char)i);
			}
			fi.close();
			break;
		case 3:
			FileWriter fw=new FileWriter("D:\\FileHandleingPogram\\DEMO.txt");
			String s="HEllo This is write using FILEWRITER";
			fw.write(s);
			fw.close();
			break;
		case 4:
			FileReader fd=new FileReader("D:\\FileHandleingPogram\\DEMO.txt");
			
			int d;
			while((d=fd.read())!=-1) {
				System.out.print((char)d);
			}
			System.out.println();
			fd.close();
			break;
		}
	}

	}

}

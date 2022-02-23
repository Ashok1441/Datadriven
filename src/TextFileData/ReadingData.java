package TextFileData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadingData {
	//Reading Data from Text File
	
	public static void main(String[] args) throws Throwable {
		
	//	Method 1 to read the data from textFile
//		FileReader fr = new FileReader("C:\\Users\\hp\\Desktop\\New Text Document.txt");
//		BufferedReader br = new BufferedReader(fr);
//		String str ;
//		
//    	while((str=br.readLine())!=null) {
//		System.out.println(str);
//		
//		}
//	   br.close();
		
		
//		Method 2 to read the data from textFile
//		File fi = new File("C:\\Users\\hp\\Desktop\\New Text Document.txt");
//		Scanner sc = new Scanner(fi);
//		while(sc.hasNextLine()) {
//			System.out.println(sc.nextLine());
//		}
		
//		Method 3 to read the data from textFile
		File fi = new File("C:\\Users\\hp\\Desktop\\New Text Document.txt");
		Scanner sc = new Scanner(fi);
		
		sc.useDelimiter("/z");
		System.out.println(sc.next());
		
		
	   
	   
	}

}

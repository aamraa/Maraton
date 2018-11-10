import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*7.Napisati program koji ucitava imena iz fajla imena.txt, a zatim ih ispisuje sortirane po abecedi.*/

public class SortiranjePoAbecedi {
	
	public static void main(String[] args) throws Exception {
	
	ArrayList <String> imena = new ArrayList <String>(); // lista ucesnika
	
	File file = new File ("imena.txt"); // kreiranje fajla
		
	try {
		 Scanner input = new Scanner(file); 
		 while (input.hasNext()) {
			
			String name = input.next();			
			imena.add(name);		 
		 }
		 input.close();  
	}
	
	catch (FileNotFoundException e) {
		System.out.print ("File ne postoji.");
	}
	
	String[] abecedniRedosljed = new String[imena.size()];
	
	for (int i = 0; i < abecedniRedosljed.length; i++) {
		
		int redniBroj = 0;
		String name = imena.get(0);
		
		for (int j = 0; j < imena.size(); j++) {
			if (imena.get(j).compareTo(name) < 0) {
				name = imena.get(j);
				redniBroj = j;
				}
		}
		abecedniRedosljed[i] =name;
		imena.remove(redniBroj);
	}
	for (int i = 0; i < abecedniRedosljed.length; i++) {
		System.out.println(abecedniRedosljed[i]);
	}
}
}
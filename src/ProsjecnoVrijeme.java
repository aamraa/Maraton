import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*Napisati program koji prolazi kroz fajl maraton.txt i ispisuje prosjecno vrijeme koje je bilo 
 * potrebno ucesnicima da zavrse maraton.*/

public class ProsjecnoVrijeme{
	
	public static void main(String[] args) throws Exception {
		
	ArrayList <Ucesnici> ucesnici = new ArrayList <Ucesnici>(); // lista ucesnika
	
	int zbirVremena = 0;
	
	File file = new File ("maraton.txt"); // file
	
	try {
		 Scanner input = new Scanner(file); 
		 while (input.hasNext()) {
			
			String name = input.next();
			int time = input.nextInt();
			Ucesnici ucesnik = new Ucesnici(name, time);
			ucesnici.add(ucesnik);		 
		 }
		 input.close();  
	}
	catch (FileNotFoundException e) {
		System.out.print ("File not found.");
	}
	
	for (int i = 0; i < ucesnici.size(); i++) {
		zbirVremena += ucesnici.get(i).getVrijemeKojeJeOstvario();
	}
	
	System.out.println("Prosjecno vrijeme koje je bilo potrebno ucesnicima da zavrse maraton je" + (zbirVremena / ucesnici.size()));
	
	}
	
}

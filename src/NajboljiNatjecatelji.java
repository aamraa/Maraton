import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*Napisati program koji prolazi kroz fajl maraton.txt, pronalazi ucesnike koji su zavrsili maraton za 
 * manje od 300 minuta, zatim sprema njihova imena i vrijeme u novi fajl pod nazivom 
 * najboljiMaratonci.txt*/

public class NajboljiNatjecatelji {
	
	public static ArrayList<Ucesnici> ucesnici = new ArrayList<Ucesnici>();

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File ("maraton.txt");
		
		File najboljiMaratonci = new File ("najboljiMaratonci.txt");

		Scanner input = new Scanner (file);
		PrintWriter output = new PrintWriter (najboljiMaratonci);
		
		while (input.hasNext()) {
			
			String name = input.next();
			int time = input.nextInt();
			Ucesnici ucesnik = new Ucesnici(name, time);
			ucesnici.add(ucesnik);		 
		 }
		 input.close();  
		 
		 System.out.println("Ucesnici koji su zavrsili maraton za manje od 300 minuta su: ");
		
		for (int i = 0; i < ucesnici.size(); i++ ) {
		if(ucesnici.get(i).getVrijemeKojeJeOstvario() < 300) {
		System.out.println( ucesnici.get(i).getImeUcesnika() + " " + ucesnici.get(i).getVrijemeKojeJeOstvario());
		}
	}
	output.close();
	}	
}



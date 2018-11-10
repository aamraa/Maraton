import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*Napisati program koji prolazi kroz fajl maraton.txt i ispisuje ime i vrijeme ucesnika koji je
 *najbrze istrcao maraton.*/

public class NajbrziNatjecatelj {

	public static void main(String[] args) throws Exception {
		
		ArrayList <Ucesnici> ucesnici = new ArrayList <Ucesnici>(); // lista ucesnika
			
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
	
		int bestTime = ucesnici.get(0).getVrijemeKojeJeOstvario();
		Ucesnici bestRunner = ucesnici.get(0);
		
		for(int i = 0; i < ucesnici.size(); i ++) {
			if (ucesnici.get(i).getVrijemeKojeJeOstvario() <= bestTime) {
				bestTime = ucesnici.get(i).getVrijemeKojeJeOstvario();
				bestRunner = ucesnici.get(i);
			}
		}
		
		System.out.println("Pobjednik/ca je " + bestRunner.getImeUcesnika() 
		+ ". Najbolje vrijeme koje je ostvario/la je: " + bestRunner.getVrijemeKojeJeOstvario());
	}

}

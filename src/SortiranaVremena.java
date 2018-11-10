import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*Napisati program koji prolazi kroz fajl maraton.txt, a zatim ispisuje imena ucesnika i njihova 
 * vremena sortirane prema vremenu koje su ostvarili od najmanjeg prema najvecem.*/

public class SortiranaVremena {
	
	public static ArrayList<Ucesnici> ucesnici = new ArrayList<Ucesnici>();
	public static ArrayList<Ucesnici> rangLista = new ArrayList<Ucesnici>();

	public static int [] sort (int [] niz) {
		
		boolean transfer = true;
		int i = 0;
		int broj;
		
		while (transfer) {
			transfer = false;
			i++;
			
			for (int j = 0; j < niz.length - i; j++) {
				if (niz[j] > niz[j + 1]) {
					broj = niz[j];
					niz[j] = niz[j + 1];
					niz[j + 1] =broj;
					transfer = true;
				
				}
			}
		}
		return niz;
	}
	
	public static void main(String[] args) throws Exception {
		

				File file = new File("maraton.txt");
				
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
				
				int[] time = new int[ucesnici.size()];
				
				for (int i = 0; i < time.length; i++) {
					time[i] = ucesnici.get(i).getVrijemeKojeJeOstvario();
				}
				
				int[] sortiratVremena = sort(time);
				
				for (int i = 0; i < sortiratVremena.length; i++) {
					for (int j = 0; j < ucesnici.size(); j++) {
						if (ucesnici.get(j).getVrijemeKojeJeOstvario() == sortiratVremena[i]) {
							rangLista.add(ucesnici.get(j));
						}
					}
					
				}

				for (int i = 0; i < rangLista.size(); i++) {
					System.out.println((i + 1)+ " " + rangLista.get(i).getImeUcesnika() 
										+ " " + rangLista.get(i).getVrijemeKojeJeOstvario());
				}

				
	}
}

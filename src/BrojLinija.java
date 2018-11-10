import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

/*6.Napisati program koji ispisuje koliko ima linija u fajlu koji se nalazi na sledecoj adresi:
http://www.textfiles.com/science/astronau.txt*/

public class BrojLinija {

	public static void main(String[] args) throws Exception {
		
		
		try {
			URL myURL = new URL("http://www.textfiles.com/science/astronau.txt"); // kreiranje url fajla
			int brojac = 0;
			
			Scanner input = new Scanner(myURL.openStream());
			while (input.hasNextLine()) {
				String line = input.nextLine();
				brojac++;
			}
			input.close();
			
			System.out.println("Broj linija u fajlu je: " + brojac);
			}
			catch (java.net.MalformedURLException e ) {
			System.out.println("Neispravan URL");
			}
			catch (java.io.IOException e) {
			System.out.println("I/O Greška: nepostojeæi fajl. ");
			}

	}
	
}

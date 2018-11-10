import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*Napisati program koji pita korisnika da unese ime, a zatim ispisuje vrijeme koje je ucesnik pod tim
 * imenom ostvario u maratonu citajuci ga iz fajla.*/

public class Pretraga {

	public static void main(String[] args) throws FileNotFoundException {
		
		int vrijeme = -1;
		File file = new File("maraton.txt");
		
		Scanner input = new Scanner(file);
		Scanner input2 = new Scanner (System.in);
		
		System.out.println("Unesite ime ucesnika: ");
		String ucesnik = input2.next();
		
		while (input.hasNext()) {
			if (input.next().equals(ucesnik)) {
				vrijeme = input.nextInt();
				System.out.println("Vrijeme ucensika je: " + vrijeme);
			}
		}
		
		if (vrijeme == -1)
			System.out.println("Greska. Ucesnik ne postoji!");
		
		input.close();
		input2.close();
	}
}
